package controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Util.FavoriteDAO;
import Util.JpaProgram;

import Util.UserDao;
import Util.VideoDao;
import model.Favorite;
import model.Report;
import model.Users;
import model.Video;

@WebServlet({ "/findvideo", "/home/video/*", "/home/findtitle", "/home/user/*", "/home/check/*","/home/full/*" })
public class bai2 extends HttpServlet {
	EntityManager em = JpaProgram.getEntityManager();
	UserDao usdao = new UserDao();
	FavoriteDAO fbdao = new FavoriteDAO();
	VideoDao videodao = new VideoDao();
	Users us = new Users();
	int add;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		String url = request.getRequestURI();
		if (url.contains("video")) {
			request.setAttribute("view", "/views/bai1/findvideo.jsp");
			this.doFindvideo(request, response);
			
		} else if (url.contains("findtitle")) {
			request.setAttribute("view", "/views/bai1/findVideoToTitle.jsp");
			this.doFindTitle(request, response);
			
		} else if (url.contains("user")) {
			request.setAttribute("view", "/views/bai1/findUserlikeVideo.jsp");
			this.doFindUserToVideo(request, response);
			
		} else if (url.contains("check")) {
			request.setAttribute("view", "/views/bai1/VideoLikeOrNotLike.jsp");
			this.doFavoriteVideo(request, response);
			
		}else if(url.contains("full")) {
			request.setAttribute("view", "/views/bai1/full.jsp");
			this.full(request, response);
		}

		request.getRequestDispatcher("/views/bai1/Home.jsp").forward(request, response);
	}



	private void doFindvideo(HttpServletRequest request, HttpServletResponse response) {
		String method = request.getMethod();
		if (method.equalsIgnoreCase("post")) {
			try {
				String id = request.getParameter("searchvideo");
				us = usdao.findById(Integer.parseInt(id));
				if (us != null) {
					List<Favorite> listFavorite = us.getFavorites();
					request.setAttribute("user", us);
					request.setAttribute("favorite", listFavorite);
				} else {
					request.setAttribute("mesage", "User không tồn tại");
				}

			} catch (Exception e) {
				request.setAttribute("mesage", "User không tồn tại");
			}
		}
	}

	private void doFindTitle(HttpServletRequest request, HttpServletResponse response) {
		String method = request.getMethod();
		if (method.equalsIgnoreCase("post")) {

			try {
				String title = request.getParameter("searchTitle");
				request.setAttribute("videoToTitle", videodao.findTitle(title));
			} catch (Exception e) {
				request.setAttribute("mesage", "Không có video");
			}

		}

	}

	private void doFindUserToVideo(HttpServletRequest request, HttpServletResponse response) {
		String method = request.getMethod();
		if (method.equalsIgnoreCase("post")) {
			try {
				String id = request.getParameter("videoid");
				if (id != null) {
					request.setAttribute("videoToUser", usdao.getUserLikeVideo(Integer.parseInt(id)));
				}
			} catch (Exception e) {
				request.setAttribute("message", "ID Video Không tồn Tại");
				e.printStackTrace();
			}
		}
	}

	private void doFavoriteVideo(HttpServletRequest request, HttpServletResponse response) {
		if (request.getMethod().equalsIgnoreCase("post")) {
			boolean isFavorite = Boolean.parseBoolean(request.getParameter("isFavorite"));
			String jpql = "";
			if (isFavorite) {
				jpql = "SELECT v FROM Video v WHERE v.favorites IS NOT EMPTY";
				request.setAttribute("isChecked", true);
			} else {
				jpql = "SELECT v FROM Video v WHERE v.favorites IS EMPTY";
				request.setAttribute("isChecked", false);
			}

			TypedQuery<Video> query = em.createQuery(jpql, Video.class);
			List<Video> lstVideos = query.getResultList();
			request.setAttribute("lstVideos", lstVideos);
		}

	}
	private void full(HttpServletRequest request, HttpServletResponse response) {
		String jpql = "select NEW Report(o.video.title,count(o),MAX(o.likedate), MIN(o.likedate))"
				+ "FROM Favorite o GROUP BY o.video.title";
		TypedQuery<Report> query = em.createQuery(jpql,Report.class);
		request.setAttribute("list", query.getResultList());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}

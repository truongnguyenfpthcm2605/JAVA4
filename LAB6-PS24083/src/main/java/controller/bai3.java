package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Util.FavoriteDAO;
import Util.JpaProgram;
import Util.Message;
import Util.UserDao;
import Util.VideoDao;
import model.Users;
import model.Video;

/**
 * Servlet implementation class bai3
 */
@WebServlet({ "/bai3", "/bai3/findByKeyword/*", "/bai3/findByUser/*", "/bai3/findInRange/*", "/bai3/findAll/*",
		"/bai3/findByFavorite/*", "/bai3/findInMotnhs/*" })
public class bai3 extends HttpServlet {
	EntityManager em = JpaProgram.getEntityManager();
	Message ms = new Message();
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
		request.setAttribute("view", "/views/bai3/findByKeyword.jsp");
		if (url.contains("findByKeyword")) {
			request.setAttribute("view", "/views/bai3/findByKeyword.jsp");
			System.out.println("ok");
			this.dofindByKeyword(request, response);

		} else if (url.contains("findByUser")) {
			request.setAttribute("view", "/views/bai3/findByUser.jsp");
			this.dofindByUser(request, response);

		} else if (url.contains("findInRange")) {
			request.setAttribute("view", "/views/bai3/findInRange.jsp");
			this.dofindInRange(request, response);

		} else if (url.contains("findInMotnhs")) {
			request.setAttribute("view", "/views/bai3/findInMotnhs.jsp");
			this.dofindInMotnhs(request, response);
		}

		request.getRequestDispatcher("/views/bai3/Home.jsp").forward(request, response);
	}

	private void dofindByKeyword(HttpServletRequest request, HttpServletResponse response) {
		if (request.getMethod().equalsIgnoreCase("post")) {
			try {
				String keyword = request.getParameter("searchTitle");
				TypedQuery<Video> query = em.createNamedQuery("Video.findByKeyword", Video.class);
				query.setParameter("keyword", "%" + keyword + "%");
				List<Video> list = query.getResultList();
				Set<Video> set = new HashSet<Video>(list);
				list.clear();
				list.addAll(set);
				request.setAttribute("videoToTitle", list);
			} catch (Exception e) {
				request.setAttribute("mesage", "ID Không tồn tại");
				e.printStackTrace();
			}
		}

	}

	private void dofindByUser(HttpServletRequest request, HttpServletResponse response) {
		if (request.getMethod().equalsIgnoreCase("post")) {
			try {
				String id = request.getParameter("searchvideo");
				TypedQuery<Video> query = em.createNamedQuery("Video.findByUser", Video.class);
				query.setParameter("id", Integer.parseInt(id));

				request.setAttribute("favorite", query.getResultList());
			} catch (Exception e) {
				request.setAttribute("mesage", "ID Không tồn tại");
				e.printStackTrace();
			}
		}

	}

	private void dofindInRange(HttpServletRequest request, HttpServletResponse response) {
		if (request.getMethod().equalsIgnoreCase("post")) {
			try {
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				String begin = request.getParameter("fromDate");
				String end = request.getParameter("toDate");
				if (begin.compareTo(end) < 0) {
					TypedQuery<Video> query = em.createNamedQuery("Video.findInRange", Video.class);
					query.setParameter("min", format.parse(begin));
					query.setParameter("max", format.parse(end));
					request.setAttribute("dateBegin", begin);
					request.setAttribute("dateEnd", end);
					List<Video> list = query.getResultList();
					Set<Video> set = new HashSet<Video>(list);
					list.clear();
					list.addAll(set);

					request.setAttribute("videoIndate", list);
				} else {
					request.setAttribute("message", "Ngày bắt đầu không được sau ngày kết thúc");
					request.setAttribute("dateBegin", begin);
					request.setAttribute("dateEnd", end);
				}

			} catch (Exception e) {
				request.setAttribute("message", "Không có video trong thời gian đó");
				e.printStackTrace();
			}
		}

	}

	private void dofindInMotnhs(HttpServletRequest request, HttpServletResponse response) {
		if (request.getMethod().equalsIgnoreCase("post")) {
			String[] valuesMonth = request.getParameterValues("month");
			if (valuesMonth != null) {
				try {
					List<Integer> months = new ArrayList<>();
					for (String item : valuesMonth) {
						months.add(Integer.parseInt(item));
						request.setAttribute("isMonth" + item, true);
					}
					TypedQuery<Video> query = em.createNamedQuery("Video.findInMotnhs", Video.class);
					query.setParameter("months", months);
					List<Video> list = query.getResultList();
					Set<Video> set = new HashSet<Video>(list);
					list.clear();
					list.addAll(set);
					request.setAttribute("lstVideos", list);
				} catch (Exception e) {
					request.setAttribute("message", "Không có video trong tháng đó");
					e.printStackTrace();
				}
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}

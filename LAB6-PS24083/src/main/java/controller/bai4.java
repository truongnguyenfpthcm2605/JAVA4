package controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
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
import model.Report;
import model.Users;
import model.Video;

/**
 * Servlet implementation class bai4
 */
@WebServlet({ "/bai4", "/bai4/top10/*", "/bai4/procedure" })
public class bai4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EntityManager em = JpaProgram.getEntityManager();
	FavoriteDAO fbdao = new FavoriteDAO();
	VideoDao videodao = new VideoDao();
	List<Integer> listYear = fbdao.getYearfavorite();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		String url = request.getRequestURI();
		request.setAttribute("view", "/views/bai4/top10.jsp");
		this.doTop10(request, response);
		if (url.contains("procedure")) {
			request.setAttribute("listYear", listYear);
			request.setAttribute("view", "/views/bai4/full.jsp");
			this.doReportByYear(request, response);

		}

		request.getRequestDispatcher("/views/bai4/Home.jsp").forward(request, response);
	}

	private void doReportByYear(HttpServletRequest request, HttpServletResponse response) {
		if (request.getMethod().equalsIgnoreCase("post")) {

			Integer year = Integer.parseInt(request.getParameter("year"));
			request.setAttribute("hi", year);
			StoredProcedureQuery query = em.createNamedStoredProcedureQuery("spFavoriteByYear");
			query.setParameter("Year", year);
			request.setAttribute("list", query.getResultList());

		}

	}

	private void doTop10(HttpServletRequest request, HttpServletResponse response) {
		try {
			Query quey = em.createNamedQuery("Video.random10", Video.class);
			request.setAttribute("videotop10", quey.getResultList());
		} catch (Exception e) {
			request.setAttribute("mesage", "Lỗi");
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}

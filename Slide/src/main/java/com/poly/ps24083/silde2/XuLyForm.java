package com.poly.ps24083.silde2;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class XuLyForm
 */
@WebServlet("/XuLyForm")
public class XuLyForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public XuLyForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// xử lý tiếng việt
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// end
		request.getRequestDispatcher("veiw/Slide1/Slide2/form.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// xử lý tiếng việt
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// end
		String name = request.getParameter("name");
		String[] bobby = request.getParameterValues("hobbies");
		String gender = request.getParameter("gender");
		String select = request.getParameter("select");
		request.setAttribute("name", name);
		request.setAttribute("hobby", bobby);
		request.setAttribute("gender", gender);
		request.setAttribute("select", select);

		// một số phuong thưc
		// lấy đường dẫn ứng dụng
		System.out.println(request.getContextPath());
		// lây url hiện tại
		System.out.println(request.getRequestURL());
		// lay uri hiện tại
		System.out.println(request.getRequestURI());
		// lay method hiện tại
		System.out.println(request.getMethod());
		// lay post
		System.out.println(request.getServerPort());
		// lay name
		System.out.println(request.getServerName());

		// lay tât cả name và value
		Enumeration<String> names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String s = (String) names.nextElement();
			String value = request.getParameter(s);
			System.out.println(s + value);

		}
		request.getRequestDispatcher("veiw/Slide1/Slide2/result.jsp").forward(request, response);
	}

}

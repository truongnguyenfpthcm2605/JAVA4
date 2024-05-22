package com.poly.ps24083.slide8;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class layout
 */
@WebServlet({"/home","/home/about","/home/feedback","/home/contact"})
public class layout extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		if(uri.contains("about")) {
			request.setAttribute("view","/veiw/Slide1/Slide8/about.jsp" );
		}else if(uri.contains("feedback")) {
			request.setAttribute("view","/veiw/Slide1/Slide8/feedback.jsp" );
		}else {
			request.setAttribute("view","/veiw/Slide1/Slide8/contact.jsp" );
		}

		request.getRequestDispatcher("/veiw/Slide1/Slide8/layout.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

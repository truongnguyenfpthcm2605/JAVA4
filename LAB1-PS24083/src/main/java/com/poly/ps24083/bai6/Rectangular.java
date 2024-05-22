package com.poly.ps24083.bai6;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Rectangular
 */
@WebServlet("/Rectangular")
public class Rectangular extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/Rectangular/Calculation.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String error = "";
		String uri = "/Rectangular/Result.jsp";
		try {
			String dai = request.getParameter("height");
			double a = Double.parseDouble(dai);
			String rong = request.getParameter("width");
			double b = Double.parseDouble(rong);
			
			if(thanZero(dai) && thanZero(rong)) {
				double  s = a*b;
				double p = (a+b)*2;
				request.setAttribute("s", s);
				request.setAttribute("p", p);
			}else {
				error = "Chiều dài và chiều rộng phải lớn hơn 0";
				uri = "/Rectangular/Calculation.jsp";
			}

		} catch (NumberFormatException e) {
			error = "Vui lòng nhập chiều dài và chiều rông là số ";
			uri = "/Rectangular/Calculation.jsp";
		}
		request.setAttribute("error", error);
		request.getRequestDispatcher(uri).forward(request, response);
	}
	
	public boolean thanZero(String text) {
		return Double.parseDouble(text) > 0;
	}


}

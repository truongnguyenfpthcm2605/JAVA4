package com.poly.ps24083.bai1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Triangle
 */
@WebServlet({ "/Tamgiac", "/dientich", "/chuvi" })
public class Triangle extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("Triangle/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NumberFormatException {
		try {
			double a = Double.parseDouble(request.getParameter("a"));
			double b = Double.parseDouble(request.getParameter("b"));
			double c = Double.parseDouble(request.getParameter("c"));
			if ((a + b > c) && (a + c > b) && (b + c > a)) {
				double chuvi = (a + b + c);
				
				String uri = request.getRequestURI();
				if (uri.contains("dientich")) {
					double dienTich = Math.sqrt(chuvi * (a + b - c) * (a + c - b) * (b + c - a)) / 4;
					request.setAttribute("message", "Diện tích của tam giác là " + dienTich);
				} else if (uri.contains("chuvi")) {
					request.setAttribute("message", "Chu vi cua Tam Giác Là : " + chuvi);
				}
			} else {
				request.setAttribute("message", "Không Thỏa mãn điều kiện là một Tam Giác");
			}
		} catch (Exception e) {
			request.setAttribute("message", "Vui lòng nhập các cạnh là số");
			e.printStackTrace();
		}

		request.getRequestDispatcher("Triangle/index.jsp").forward(request, response);
	}

}

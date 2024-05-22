package com.poly.ps24083.bai2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Management
 */
@WebServlet("/Management")
public class Management extends HttpServlet {
	List<User> users = new ArrayList<>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		if (users.isEmpty()) {
			users.add(new User("Truong", "123", false));
			users.add(new User("Ngan", "123", true));
			users.add(new User("Nam", "123", false));
		}

		request.setAttribute("message", "Quản Lý người sử dụng");
		request.setAttribute("form", users.get(0));
		request.setAttribute("items", users);

		request.getRequestDispatcher("views/bai2/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		System.out.println(pass);
		boolean remember = Boolean.parseBoolean(request.getParameter("check"));
		if (!user.isEmpty()  && !pass.isEmpty()) {
			users.add(submit(user, pass, remember));
		}
		doGet(request, response);
	}

	public static User submit(String user, String pass, boolean check) {
		return new User(user, pass, check);
	}

}

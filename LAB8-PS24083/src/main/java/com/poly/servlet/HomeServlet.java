package com.poly.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/home/index","/home/about","/home/contact"})
public class HomeServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		if(uri.contains("index")) {
			req.setAttribute("view", "/views/home/index.jsp");
		}else if(uri.contains("about")) {
			req.setAttribute("view", "/views/home/about.jsp");
		}else if(uri.contains("contact")) {
			req.setAttribute("view", "/views/home/contact.jsp");
		}
		req.getRequestDispatcher("/views/layout.jsp").forward(req, resp);
	}
}

package com.poly.ps24083.bai2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/FormReisgter-ok")
public class FormReisgter extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/form/form.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		String gender = req.getParameter("male");
		String family = req.getParameter("family");
		String nationality = req.getParameter("Country");
		String note = req.getParameter("note");
		String[] hobbies = req.getParameterValues("hobbies");
		req.setAttribute("name", user);
		req.setAttribute("pass", pass);
		req.setAttribute("gender", gender);
		req.setAttribute("family", family);
		req.setAttribute("Nationality", nationality);
		req.setAttribute("hobbies", hobbies);
		req.setAttribute("note",note );
		req.getRequestDispatcher("/form/info.jsp").forward(req, resp);
		boolean genders = Boolean.parseBoolean(req.getParameter("male"));
		boolean married = req.getParameter("family")!=null;
		System.out.println(">> username : " + user);
		System.out.println(">> password : " + pass);
		System.out.println(">>  Gender: " + genders);
		System.out.println(">> Family : " + married);
		System.out.println(">> Hobbies : " + Arrays.toString(hobbies));
		System.out.println(">> Note: " + note);
		
	

	}
	
}

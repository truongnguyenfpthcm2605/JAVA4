package com.poly.ps24083.slide4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forEach")
public class forEach extends HttpServlet {

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, Double> map = new HashMap<>();
		map.put("toan", 5.0);
		map.put("ly", 7.0);
		
		List<String> list = new ArrayList<>();
		list.add("Trung");
		list.add("Nam");
		request.setAttribute("map", map);
		request.setAttribute("list", list);
		request.getRequestDispatcher("veiw/Slide1/Slide4/Foreach.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

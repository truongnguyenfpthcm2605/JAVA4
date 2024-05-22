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

import com.poly.ps24083.util.Student;

/**
 * Servlet implementation class ListandMap
 */
@WebServlet("/ListandMap")
public class ListandMap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListandMap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, Double> map = new HashMap<>();
		map.put("toan", 5.0);
		map.put("ly", 7.0);
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(1,"Truong"));
		list.add(new Student(2,"Ngân"));
		
		request.setAttribute("map", map);
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("veiw/Slide1/Slide4/ListAndMap.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.poly.ps24083.bai1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class bai1include
 */
@WebServlet("/bai1include")
public class bai1include extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bai1include() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(1, "Iphone 14 Pro", "iphone14.png", 3300));
		list.add(new Product(2, "Ipad Air2 Pro", "ipad.png", 34000));
		list.add(new Product(3, "Macebook Pro", "macebook.png", 3500));
		list.add(new Product(4, "Iphone 14 Pro", "iphone14.png", 3300));
		list.add(new Product(5, "Ipad Air2 Pro", "ipad.png", 34000));
		list.add(new Product(6, "Macebook Pro", "macebook.png", 3500));
		
		HttpSession sesion = request.getSession();
		sesion.setAttribute("list", list);
		
		request.getRequestDispatcher("views/bai1/main.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

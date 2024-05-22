package com.poly.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import com.poly.dao.ClientImpl;
import com.poly.enity.Clients;

/**
 * Servlet implementation class HomeController
 */
@WebServlet({ "/index", "/find", "/insert" })
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int pageMaxsize = 8;
	ClientImpl dao = new ClientImpl();
	List<Clients> items;

	public HomeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
		switch (path) {
		case "/index":
			doIndex(request, response);
			break;
		case "/insert":
			doInsert(request, response);
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + path);
		}
	}

	private void doInsert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/views/form.jsp").forward(request, response);
		
	}

	private void doIndex(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		List<Clients> list = dao.findAll();
		request.setAttribute("items",list );
		request.getRequestDispatcher("/views/index.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
		switch (path) {
		case "/find":
			doPostFind(request, response);
			break;
		case "/insert":
			doPostInsert(request, response);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + path);
		}
	}

	private void doPostInsert(HttpServletRequest request, HttpServletResponse response) {
		Clients c = new Clients();
		try {
			BeanUtils.populate(c, request.getParameterMap());
			if(dao.findById(c.getUsername())!=null) {
				request.setAttribute("form", c);
				request.setAttribute("mesage", "User đã tồn tại");
				request.getRequestDispatcher("/views/form.jsp").forward(request, response);
			}else {
				boolean check = dao.insert(c);
				if(check) {
					request.setAttribute("mesage", "Thêm Thành Công");
				}else {
					request.setAttribute("mesage", "Thêm Thất bại");
					
				}
				request.getRequestDispatcher("/views/form.jsp").forward(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private void doPostFind(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String e = request.getParameter("search");
		List<Clients> list  = dao.findTitle(e);
		request.setAttribute("items",list );
		request.getRequestDispatcher("/views/index.jsp").forward(request, response);
		
	}

}

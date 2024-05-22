package com.poly.ps24083.bai4;

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
@WebServlet({ "/bai4", "/loai1", "/loai2", "/loai3", "/search" })
public class bai4 extends HttpServlet {

	Items it = new Items();
	List<Items> list = new ArrayList<>();
	List<Items> newList = new ArrayList<>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		list.add(new Items(1, "Iphone 14 Pro", "iphone14.png", 3300, 0.2));
		list.add(new Items(2, "Ipad Air2 Pro", "ipad.png", 34000, 0.3));
		list.add(new Items(3, "Macebook Pro", "macebook.png", 3500, 0.5));
		list.add(new Items(4, "Iphone 14 Pro", "iphone14.png", 3300, 0.6));
		list.add(new Items(5, "Ipad Air2 Pro", "ipad.png", 34000, 0.7));
		list.add(new Items(6, "Macebook Pro", "macebook.png", 3500, 0.9));
		String uri = request.getRequestURI();

		if (uri.contains("loai1")) {
			newList = getSarch(list, "Iphone 14 Pro");
		} else if (uri.contains("loai2")) {
			newList = getSarch(list, "Macebook Pro");
		} else if (uri.contains("loai3")) {
			newList = getSarch(list, "Ipad Air2 Pro");
		} else if (uri.contains("search")) {
			int id = Integer.parseInt(request.getParameter("id"));
			it = getItems(list, id);
			request.setAttribute("item", it);
			request.getRequestDispatcher("views/bai4/Cart.jsp").forward(request, response);
		} else {
			newList = list;
		}
		String id = request.getParameter("id");
		System.out.println(id);

		request.setAttribute("items", newList);

		request.getRequestDispatcher("views/bai4/Carts.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public static List<Items> getSarch(List<Items> list, String name) {
		List<Items> newList = new ArrayList<>();
		for (Items items : list) {
			if (items.getName().equals(name)) {
				newList.add(items);
			}
		}
		return newList;
	}
	public static Items getItems(List<Items> list, int id ) {
		for (Items items : list) {
			if (items.getId() == id) {
				return items;
			}
		}
		return null;
	}

}

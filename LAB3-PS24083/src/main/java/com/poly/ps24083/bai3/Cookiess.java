package com.poly.ps24083.bai3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

/**
 * Servlet implementation class Cookie
 */
@WebServlet("/Cookie")
public class Cookiess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// lay du lieu co sẵn
		String user = "admin";
		String pass = "123";
		String mess = "";
		// so sanh vơi cookie trên browser
		Cookie c = CookieUtils.get(user, pass, request);
		if (c != null) {
			request.setAttribute("user", c.getName());
			request.setAttribute("pass", c.getValue());
			mess = "Cookie tồn tại";
		} else {
			mess = " cookie Chưa tồn tai";
		}
		request.setAttribute("message", mess);
		request.getRequestDispatcher("bai4/SigninCookie.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String mess = "";
		// khai bao name và value của cookie
		try {
			CookieUser ck = new CookieUser();
			BeanUtils.populate(ck, request.getParameterMap());
			if (ck.getUser().equals("admin") && ck.getPass().equals("123")) {
				if(ck.isCheck()) {
					CookieUtils.add(ck.getUser(), ck.getPass(), 1, response);
					mess = "Đã lưu cookie";
				}else {
					CookieUtils.add(ck.getUser(), ck.getPass(), 0, response);
					mess = "Không  lưu cookie";
				}
			} else {
				mess = "Sai user or pass";
			}
			request.setAttribute("message", mess);
		} catch (Exception e) {

		}
		request.getRequestDispatcher("bai4/SigninCookie.jsp").forward(request, response);
	}

}

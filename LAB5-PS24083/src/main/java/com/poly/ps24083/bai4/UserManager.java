package com.poly.ps24083.bai4;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.poly.ps24083.bai2.User;
import com.poly.ps24083.bai3.UserDao2;
import com.poly.ps24083.bai3.Util;

@WebServlet({ "/UserManager", "/account/sgin-up", "/account/sgin-in", "/account/sgin-out", "/account/forgot-password",
		"/account/change-password", "/account/profile", "/account/xulydangnhap", "/account/xulydangky",
		"/account/xulyedit" })
public class UserManager extends HttpServlet {
	User us = new User();
	User uss = new User();
	Util tl = new Util();
	CookieUser ck = new CookieUser();
	boolean check;
	int add;
	String account= "Đăng Nhập";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();

		request.setAttribute("account", account);
		request.setAttribute("view", "/views/UserManager/login.jsp");
		
		
		if (uri.contains("sgin-up")) {
			request.setAttribute("view", "/views/UserManager/register.jsp");
			try {
				BeanUtils.populate(uss, request.getParameterMap());
				request.setAttribute("user", uss);
			} catch (Exception e) {
				// TODO: handle exception
			}
			this.doSginUp(request, response);
		} else if (uri.contains("profile")) {
			request.setAttribute("view", "/views/UserManager/editprofile.jsp");
			us = UserDao2.findID(account);
			if (us == null) {
				request.setAttribute("editmessage", "Bạn chưa đăng Nhập, Phai đăng nhập rồi mới cập nhật được");
			} else {
				request.setAttribute("from", us);
				this.doProfile(request, response);
			}

		} else if (uri.contains("sgin-in")) {
			request.setAttribute("view", "/views/UserManager/login.jsp");
			this.doSginIn(request, response);
		}
		request.getRequestDispatcher("/views/UserManager/Home.jsp").forward(request, response);
	}

	private void doSginIn(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String method = request.getMethod();
		if (method.equalsIgnoreCase("POST")) {
			
			
			try {
				BeanUtils.populate(ck, request.getParameterMap());
				User us = UserDao2.findUser(ck.user, ck.pass);
				
				
				if (us == null) {
					request.setAttribute("message", "Sai tài khoản hoặc mật khẩu");
				} else {
					
					setCookie(request, response);
					request.setAttribute("message", "Đăng Nhập Thành Công");
					request.setAttribute("account", us.getId());
					account = us.getId();
				}
			} catch (Exception e) {

			}
		}

	}

	private void doProfile(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String method = request.getMethod();
		if (method.equalsIgnoreCase("POST")) {
				try {
					check = checkForm(us, request, tl);
					if (check) {
						BeanUtils.populate(us, request.getParameterMap());
						add = UserDao2.update(us);
						String atr = tl.getAttr("Cập Nhật Thành Công", "ID Không tồn tại không thể cập nhật", add);
						request.setAttribute("editmessage", atr);
					} else {
						request.setAttribute("editmessage", "Kiểm tra lại form");
					}
				} catch (Exception e) {
					request.setAttribute("editmessage", "Cập Nhật  Thất bại");
				}

			
		}

	}

	private void doSginUp(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String method = request.getMethod();
		if (method.equalsIgnoreCase("POST")) {

			try {
				check = checkForm(us, request, tl);
				if (check) {
					BeanUtils.populate(us, request.getParameterMap());
					add = UserDao2.create(us);
					String atr = tl.getAttr("Đăng Ký Thành Công", "ID đã tồn tại", add);
					request.setAttribute("editregister", atr);
				} else {
					request.setAttribute("editregister", "Kiểm tra lại form");
				}
			} catch (Exception e) {
				request.setAttribute("editregister", "Đăng Ký Thất bại");
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public static boolean checkForm(User us, HttpServletRequest rq, Util tl) {
		try {
			BeanUtils.populate(us, rq.getParameterMap());
			String id = tl.checkID(us.getId(), "ID không được bỏ trống",
					"ID chỉ bao gồm ít nhất một chữ cái thường và số có độ dài ít nhất 5 kí tự");
			String pass = tl.checkPassword(us.getPassword(), "Password không được bỏ trống",
					"Password có ít nhật 1 chữ IN HOA, 1 chữ in thường và chữ số có độ dài ít nhất 8 kí tự");
			String name = tl.checkFulName(us.getFullname(), "Fullname không được bỏ trống",
					"Fulname chưa đúng định dạng");
			String email = tl.checkEmail(us.getEmail(), "Email không được bỏ trống", "Email chưa đúng định dạng");
			rq.setAttribute("errid", id);
			rq.setAttribute("errpass", pass);
			rq.setAttribute("errfullname", name);
			rq.setAttribute("erremail", email);
			if (id.isEmpty() && pass.isEmpty() && name.isEmpty() && email.isEmpty()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static  void setCookie(HttpServletRequest request, HttpServletResponse response) {
		CookieUser ck = new CookieUser();
		try {
			BeanUtils.populate(ck, request.getParameterMap());
			if(ck.isCheck()) {
				CookieUtils.add(ck.getUser(), ck.getPass(), 1, response);
			}else {
				CookieUtils.add(ck.getUser(), ck.getPass(), 0, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

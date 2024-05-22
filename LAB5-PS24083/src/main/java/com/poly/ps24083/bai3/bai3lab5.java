package com.poly.ps24083.bai3;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.poly.ps24083.bai2.User;

@WebServlet({ "/bai3lab5", "/user/index", "/user/edit/*", "/user/create", "/user/update", "/user/delete",
		"/user/reset" })
public class bai3lab5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int add;
	Boolean check;
	User ac = new User();
	Util tl = new Util();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public bai3lab5() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		if (uri.contains("edit")) {
			String id = uri.substring(uri.lastIndexOf("/") + 1);
			ac = UserDao2.findID(id);
		} else if (uri.contains("create")) {
			try {
				check = checkForm(ac, request,tl);
				if (check) {
					BeanUtils.populate(ac, request.getParameterMap());
					add = UserDao2.create(ac);
					String atr = tl.getAttr("Thêm Thành Công", "Trùng ID Không thể thêm", add);
					request.setAttribute("mesage", atr);
				} else {
					request.setAttribute("mesage", "Kiểm tra lại form");
				}
			} catch (Exception e) {
				request.setAttribute("mesage", "Thêm Thất bại");
			}

		} else if (uri.contains("update")) {
			try {
				check = checkForm(ac, request, tl);
				if(check) {
					BeanUtils.populate(ac, request.getParameterMap());
					add = UserDao2.update(ac);
					String atr = tl.getAttr("Cập Nhật Thành Công", "ID Không tồn tại không thể cập nhật", add);
					request.setAttribute("mesage", atr);
				}else {
					request.setAttribute("mesage", "Kiểm tra lại form");
				}
			} catch (Exception e) {
				request.setAttribute("mesage", "Cập Nhật  Thất bại");
			}

		} else if (uri.contains("delete")) {
			try {
					add = UserDao2.delete(request.getParameter("id"));
					String atr = tl.getAttr("Xóa Thành Công", "Xóa Thất bại ID Không tồn tại", add);
					request.setAttribute("mesage", atr);
			} catch (Exception e) {
				request.setAttribute("mesage", "Xóa  Thất bại");
			}
		} else if (uri.contains("reset")) {
			ac = null;
		}

		request.setAttribute("from", ac);
		request.setAttribute("items", UserDao2.findAll());
		request.getRequestDispatcher("/views/formManager.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	public static boolean checkForm(User us, HttpServletRequest rq,Util tl) {
		try {
			BeanUtils.populate(us, rq.getParameterMap());
			String id = tl.checkID(us.getId(),"ID không được bỏ trống" , "ID chỉ bao gồm chữ cái và số có độ dài ít nhất 5 kí tự");
			String pass = tl.checkPassword(us.getPassword(),"Password không được bỏ trống" , "Password có ít nhật 1 chữ IN HOA, 1 chữ in thường và chữ số có độ dài ít nhất 8 kí tự");
			String name = tl.checkFulName(us.getFullname(),"Fullname không được bỏ trống" , "Fulname chưa đúng định dạng");
			String email = tl.checkEmail(us.getEmail(),"Email không được bỏ trống" , "Email chưa đúng định dạng");
			rq.setAttribute("errid",id );;
			rq.setAttribute("errpass",pass );
			rq.setAttribute("errfullname",name);
			rq.setAttribute("erremail",email );
			if(id.isEmpty() && pass.isEmpty() && name.isEmpty() && email.isEmpty()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}

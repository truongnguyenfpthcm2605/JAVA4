package com.poly.ps24083.jpa;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

/**
 * Servlet implementation class Test6
 */
@WebServlet({ "/Test6","/user/index", "/user/edit/*", "/user/create", "/user/update", "/user/delete","/user/reset" })
public class Test6 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 		AccountDAO dao = new AccountDAO();
	 		Account ac = new Account();
	 		String uri = request.getRequestURI();
	 		if (uri.contains("edit")) {
	 				int id = Integer.parseInt(uri.substring(uri.lastIndexOf("/")+1));
	 				 ac =dao.findById(id);
	 		} else if (uri.contains("create")) {
	 			try {
	 				BeanUtils.populate(ac, request.getParameterMap());
	 				dao.create(ac);
	 				request.setAttribute("message", "Thêm Thành Công");
	 			} catch (Exception e) {
	 				request.setAttribute("message", "Thêm Thất Bại");
	 			}
	 
	 		} else if (uri.contains("update")) {
	 			try {
	 				BeanUtils.populate(ac, request.getParameterMap());
	 				dao.Update(ac);
	 				request.setAttribute("message", "Cập Nhật Thành Công");
	 			} catch (Exception e) {
	 				request.setAttribute("message", "Cập Nhật Thất Bại");
	 			}
	 
	 		} else if (uri.contains("delete")) {
	 			try {
	 				int id = Integer.parseInt(request.getParameter("id"));
	 				dao.remove(id);
	 				request.setAttribute("message", "Xóa Thành Công");
	 			} catch (Exception e) {
	 				request.setAttribute("message", "Xóa Thất Bại");
	 			}
	 		}else if(uri.contains("reset")) {
	 			ac =null;
	 		}

	 		request.setAttribute("from", ac);
	 		request.setAttribute("items", dao.findAll());
		request.getRequestDispatcher("/veiw/Slide1/Slide5/ManagerAdmin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

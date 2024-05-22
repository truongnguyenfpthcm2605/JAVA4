package com.poly.ps24083.bai2;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;

/**
 * Servlet implementation class form
 */
@MultipartConfig
@WebServlet("/form")
public class form extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("bai2/form.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// dinh dang time
			DateTimeConverter date = new DateConverter(new Date());
			date.setPattern("MM/dd/yyyy");
			ConvertUtils.register(date, Date.class);
			
			// xut lysvao bean
			Information in = new Information();
			BeanUtils.populate(in, request.getParameterMap());
			
			
			// xử lý hinh anh
			Part photo = request.getPart("image");
			String pathImg = request.getServletContext().getRealPath("/images");
			String fileName = Path.of(photo.getSubmittedFileName()).getFileName().toString();
			photo.write(pathImg+"/"+fileName);
			in.setImage(fileName);
			request.setAttribute("bean", in);
		} catch (Exception e) {
			e.printStackTrace();		}
			

		request.getRequestDispatcher("bai2/infor.jsp").forward(request, response);
	}

}

package com.poly.ps24083.slide3;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class upLoadFile
 */

// su dung upload file
@MultipartConfig()
@WebServlet("/upLoadFile")
public class upLoadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("veiw/Slide1/Slide3/upload.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// lay file tren jsp
		Part photo = request.getPart("photo");
		
		// duong dan thực
		String realpath =  request.getServletContext().getRealPath("/upload");
		
		//
		String filename = Paths.get(photo.getSubmittedFileName()).getFileName().toString();
		// kiểm tra nếu folde không có thì tạo ra nó
		if(!Files.exists(Paths.get(realpath))) {
			Files.createDirectory(Paths.get(realpath));
		}
		// ghi file vao thư muc
		photo.write(realpath+"/"+filename);
		System.out.println(realpath);
		System.out.println(filename);
		System.out.println(photo.getSubmittedFileName());
		response.getWriter().println("<h1> FPT Polytechnic </h1>");
		response.getWriter().println("<img src='upload/"+filename+"' />");

	}

}

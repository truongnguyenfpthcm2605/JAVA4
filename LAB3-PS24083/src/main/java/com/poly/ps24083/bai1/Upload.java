package com.poly.ps24083.bai1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Upload
 */
@MultipartConfig
@WebServlet("/Upload")
public class Upload extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("/bai1/upload.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String realpath =  request.getServletContext().getRealPath("/images");
		if(!Files.exists(Paths.get(realpath))) {
			Files.createDirectory(Paths.get(realpath));
		}
		// img
		Part photo = request.getPart("image");
		String filename = Paths.get(photo.getSubmittedFileName()).getFileName().toString();
		photo.write(realpath+"/"+filename);
		
		// file tai liêu
		Part doc = request.getPart("document"); // file tài liệu
		String docname = Paths.get(doc.getSubmittedFileName()).getFileName().toString();
		doc.write(realpath+"/"+docname);
		
		
		System.out.println(request.getContextPath());
		// chia sẻ cho result.jsp để hiển thị
		request.setAttribute("img", filename);
		request.setAttribute("doc", docname);
		
		request.getRequestDispatcher("/bai1/Result.jsp").forward(request, response);
	}

}

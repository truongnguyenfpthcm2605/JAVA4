package com.poly.ps24083.bai3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLife
 */
@WebServlet("/ServletLife")
public class ServletLife extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int count;
	Path path = Paths.get("D:\\JAVA4\\count.txt");

	@Override
	public void init() throws ServletException {
		try {
			count = Integer.parseInt(Files.readAllLines(path).get(0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		count++;
		req.setAttribute("count", count);
		req.getRequestDispatcher("/ServletLife/test.jsp").forward(req, resp);
	}

	@Override
	public void destroy() {
		try {
			Files.write(path, String.valueOf(count).getBytes(), StandardOpenOption.WRITE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

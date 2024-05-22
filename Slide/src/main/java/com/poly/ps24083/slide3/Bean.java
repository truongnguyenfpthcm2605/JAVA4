package com.poly.ps24083.slide3;

import java.beans.SimpleBeanInfo;
import java.io.IOException;
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

import com.poly.ps24083.util.*;
/**
 * Servlet implementation class Bean
 */
@MultipartConfig()
@WebServlet("/Bean")
public class Bean extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("veiw/Slide1/Slide3/formbean.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// dinh dang thoi gian
			DateConverter dtc = new DateConverter(new Date());
			dtc.setPattern("MM/dd/yyyy");
			ConvertUtils.register(dtc, Date.class);
			// end
			
			// xu ly bean
			Staff bean = new Staff();
			BeanUtils.populate(bean, request.getParameterMap());
			// end
			
			// lay ten file
			 Part part =request.getPart("file");
			 bean.setFile(part.getSubmittedFileName());
			 // end
			 
			request.setAttribute("bean",bean);
		} catch (Exception e) {
			// TODO: handle exception
		}
		request.getRequestDispatcher("veiw/Slide1/Slide3/resultbean.jsp").forward(request, response);
	}

}

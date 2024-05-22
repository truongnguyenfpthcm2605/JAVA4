package com.poly.ps24083.slide3;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import com.poly.ps24083.util.*;
import jakarta.activation.*;


@MultipartConfig
@WebServlet("/SendEmail")
public class SendEmail extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("veiw/Slide1/Slide3/formemail.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			InfoEmail infor = new InfoEmail();
			BeanUtils.populate(infor, request.getParameterMap());
//			String user = "truongnvps24083@fpt.edu.vn";
//			String pass = "dkfkilftpeszjupq";
			Properties prop = new Properties();
			prop.put("mail.smtp.host", "smtp.gmail.com");
			prop.put("mail.smtp.port", "465");
			prop.put("mail.smtp.auth", "true");
			prop.put("mail.smtp.socketFactory.port", "465");
			prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			Session session = Session.getInstance(prop, new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(infor.getUser(), infor.getPass());
				}
			});
			// ------------
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(infor.getUser()));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(infor.getTo()));
			
			
			message.setSubject(infor.getSub());
			message.setText(infor.getContent());
			Transport.send(message);
			request.setAttribute("message", "Success");
		} catch (Exception e) {
			request.setAttribute("message", "Fail");
			e.printStackTrace();
		}
		request.getRequestDispatcher("veiw/Slide1/Slide3/formemail.jsp").forward(request, response);
	}

}

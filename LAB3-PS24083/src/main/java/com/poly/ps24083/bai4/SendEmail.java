package com.poly.ps24083.bai4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.beanutils.BeanUtils;

import com.poly.ps24083.bai2.Information;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.Multipart;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import jakarta.activation.*;

@MultipartConfig
@WebServlet("/SendEmail")
public class SendEmail extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("bai5/formemail.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			InfoEmail infor = new InfoEmail();
			BeanUtils.populate(infor, request.getParameterMap());

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
			message.addRecipients(Message.RecipientType.CC, InternetAddress.parse(infor.getCc()));
			message.addRecipients(Message.RecipientType.BCC, InternetAddress.parse(infor.getBcc()));

			message.setSubject(infor.getSub());
			message.setText(infor.getContent());
			String realpath = request.getServletContext().getRealPath("/files");
			if (!Files.exists(Paths.get(realpath))) {
				Files.createDirectory(Paths.get(realpath));
			}
			try {
				// img
				Part photo = request.getPart("fileupload");

				String filename = Paths.get(photo.getSubmittedFileName()).getFileName().toString();
				photo.write(realpath + "/" + filename);

				File fileupload = new File(realpath + "/" + filename);
				MimeBodyPart messageBodyPart = new MimeBodyPart();
				Multipart multipart = new MimeMultipart();
				messageBodyPart.attachFile(fileupload);
				multipart.addBodyPart(messageBodyPart);
				message.setContent(multipart);
			} catch (Exception e) {

			}
			Transport.send(message);
			request.setAttribute("message", "Success");
		} catch (Exception e) {
			request.setAttribute("message", "Fail");
			e.printStackTrace();
		}

		request.getRequestDispatcher("bai5/formemail.jsp").forward(request, response);
	}

}

package com.poly.ps24083.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtils {
	// tao va lưu cookie trên client
	public static void add(String name,String value,int hours,HttpServletResponse resp) {
		Cookie cookie = new Cookie(name, value);
		cookie.setMaxAge(hours*60*60);
		cookie.setPath("/"); // co hieu luc toan site
		resp.addCookie(cookie); // gui về client
		
	}
	// lay  gia tri cookie gui ve client
	public static Cookie get(String name,String value, HttpServletRequest req) {
		Cookie[] cookie = req.getCookies();
		if(cookie!=null) {
			for(Cookie c : cookie) {
				if(c.getName().equalsIgnoreCase(name) && c.getValue().equalsIgnoreCase(value)) {
					return c;
				}
			}
		}
		return null;
	}




}

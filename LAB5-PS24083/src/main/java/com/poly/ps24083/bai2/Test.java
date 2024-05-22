package com.poly.ps24083.bai2;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		User us = new User();
		us.setId("5");
		us.setFullname("Nguyen van Minh Nga");
		us.setEmail("truong@gmail.com");
		us.setPassword("12345");
		us.setAdmin(false);
		
		List<User> list = UserDao.findKeyWord("Ng");
		list.forEach(c->{
			System.out.println(c.toString());
		});

	}
}

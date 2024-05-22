package com.poly.ps24083.jpa;
import java.util.List;

import javax.persistence.*;
public class Test {
	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
		List<Account> list = dao.findAll();
		System.out.println(list.size());
		
		list.forEach(c ->{
			
			System.out.println(c.getEmail());
		});
	}
}

package com.poly.ps24083.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Test3 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("DEMO");
		EntityManager en = factory.createEntityManager();
		
		String jpql = "SELECT o FROM Account o ";
		
		TypedQuery<Account> query  = en.createQuery(jpql,Account.class);  // lay row của table theo truy vấn
		query.setFirstResult(0);  //vi tri bat dau
		query.setMaxResults(2); // so luong thuc the lấy tối đa
		List<Account> list = query.getResultList();
		System.out.println(list.size());
		
		list.forEach(c -> {
			System.out.println(c.getEmail());
			System.out.println(c.getFullname());
		});
	}
}

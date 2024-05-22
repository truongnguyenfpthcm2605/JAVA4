package com.poly.ps24083.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Test4 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("DEMO");
		EntityManager en = factory.createEntityManager();
		
		String jpql = "SELECT o FROM Account o WHERE  o.admin=:role";
		TypedQuery<Account> query  = en.createQuery(jpql,Account.class);  // lay row của table theo truy vấn
		query.setParameter("role", true);
		List<Account> list = query.getResultList();

		
		list.forEach(c -> {
			System.out.println(c.getAdmin());
			System.out.println(c.getFullname());
		});
	}
}

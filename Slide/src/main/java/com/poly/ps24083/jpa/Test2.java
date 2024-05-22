package com.poly.ps24083.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Test2 {
			public static void main(String[] args) {
				EntityManagerFactory factory = Persistence.createEntityManagerFactory("DEMO");
				EntityManager en = factory.createEntityManager();
				
				String jpql = "SELECT o FROM Account o ";
				TypedQuery<Account> query = en.createQuery(jpql, Account.class);
				List<Account> resultList = query.getResultList();

				if(resultList.size() > 1) {
				    Account ac = resultList.get(0);
				  System.out.println(ac.getEmail());
				} else {
				   System.out.println("Có nhieu ket qua");
				}

				en.close();
			}
			
}

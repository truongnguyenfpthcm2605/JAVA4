package com.poly.ps24083.slide5;




import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Demo {
	public static void main(String[] args) {
		
		getUsers();
	}
	
	public static void getUsers() {
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			// la 1 đối tượng Users
			Query<Users>  cats= session.createQuery("from Users");
			// lấy danh sách
			List<Users> list = cats.list();
			list.forEach(c -> System.out.println(c.getId() +c.getFullname()+c.getEmail()+c.getPassword()+c.getAdmin()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void insert() {
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.getTransaction().begin();
			Class cls = session.get(Class.class, "1"); // == select * from Class where id = 2
			Users us = new Users();
			us.setFullname("Ngan");
			us.setPassword("123");
			us.setAdmin(true);
			us.setEmail("ngan@gmail.com");
			us.setIdclass(cls);
			 // lưu csdl
			session.save(us);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

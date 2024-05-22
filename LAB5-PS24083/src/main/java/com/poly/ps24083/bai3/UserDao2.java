package com.poly.ps24083.bai3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.poly.ps24083.bai2.JpaProgram;
import com.poly.ps24083.bai2.User;

public class UserDao2 {
	public static EntityManager em = JpaProgram.getEntityManager();
	public static int create(User us) {
		try {
			em.getTransaction().begin();
			em.persist(us);
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return -1;
		
	}
	public static int update(User us) {
		try {
			em.getTransaction().begin();
			if(findID(us.getId())!=null) {
				em.merge(us);
				em.getTransaction().commit();
				return 1;
			}
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();

		}
		return -1;
		
	}
	public static int delete(String id) {
		try {
			em.getTransaction().begin();
			User us= findID(id);
			if(us!=null) {
				em.remove(us);
				em.getTransaction().commit();
				return 1;
			}
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return -1;
		
	}
	public static List<User> findAll() {
			String jpql = "SELECT u FROM User u";
			TypedQuery<User> query = em.createQuery(jpql,User.class);
			return query.getResultList();
	}
	public static List<User> findAdmin(boolean role){
		String jpql = "SELECT u FROM User u WHERE u.admin=:role";
		TypedQuery<User> query = em.createQuery(jpql,User.class);
		query.setParameter("role", role);
		return query.getResultList();
	}
	
	public static List<User> findKeyWord(String  key){
		String jpql = "SELECT u FROM User u WHERE u.fullname LIKE ?0";
		TypedQuery<User> query = em.createQuery(jpql,User.class);
		query.setParameter(0, "%"+key+"%");
		return query.getResultList();
	}
	
	public static User findUser(String  user,String pass){
		try {
			String jpql = "SELECT u FROM User u WHERE u.id=:id AND u.password=:pw";
			TypedQuery<User> query = em.createQuery(jpql,User.class);
			query.setParameter("id", user);
			query.setParameter("pw", pass);
			return query.getSingleResult();
		} catch (Exception e) {
			
		}
		return null;
		
	}
	
	public static User findID(String id){
		try {
			String jpql = "SELECT u FROM User u WHERE u.id=:id ";
			TypedQuery<User> query = em.createQuery(jpql,User.class);
			query.setParameter("id", id);
			return query.getSingleResult();
		} catch (Exception e) {
			System.out.println("Không tim thấy");
		}
		return null;
	}
	public static List<User> findPage(int page, int size){
		String jpql = "SELECT u FROM User u";
		TypedQuery<User> query = em.createQuery(jpql,User.class);
		query.setFirstResult(page*size);
		query.setMaxResults(size);
		return query.getResultList();
	}
	
}

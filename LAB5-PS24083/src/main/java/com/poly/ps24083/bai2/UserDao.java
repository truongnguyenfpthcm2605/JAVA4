package com.poly.ps24083.bai2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class UserDao {
	public static EntityManager em = JpaProgram.getEntityManager();
	public static void create(User us) {
		try {
			em.getTransaction().begin();
			em.persist(us);
			em.getTransaction().commit();
			System.out.println("thêm thành công");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Thêm thất bại");
		}
		em.close();
	}
	public static void update(User us) {
		try {
			em.getTransaction().begin();
			em.merge(us);
			em.getTransaction().commit();
			System.out.println("cập nhật thành công");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("cập nhật thất bại");
		}
		em.close();
	}
	public static void delete(String id) {
		try {
			em.getTransaction().begin();
			User us = findID(id);
			if(us==null) {
				System.out.println("User không tồn tại");
			}else {
			em.remove(us);
			em.getTransaction().commit();
			System.out.println("Xoa thành công");
			}
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Xoa nhật thất bại");
		}
		em.close();
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
		String jpql = "SELECT u FROM User u WHERE u.id=:id AND u.password=:pw";
		TypedQuery<User> query = em.createQuery(jpql,User.class);
		query.setParameter("id", user);
		query.setParameter("pw", pass);
		return query.getSingleResult();
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

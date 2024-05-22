package Util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


import model.Users;

public class UserDao extends DAO<Users, Integer> {
	public static EntityManager em = JpaProgram.getEntityManager();
	@Override
	public int insert(Users enity) {
		try {
			em.getTransaction().begin();
			em.persist(enity);
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public int update(Users enity) {
		try {
			em.getTransaction().begin();
			if(findById(enity.getId())!=null) {
				em.merge(enity);
				em.getTransaction().commit();
				return 1;
			}
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();

		}
		return -1;
		
	
	}

	@Override
	public int delete(Integer key) {
		try {
			em.getTransaction().begin();
			Users us= findById(key);
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

	@Override
	public Users findById(Integer key) {
		try {
			String jpql = "SELECT u FROM Users u WHERE u.id=:id ";
			TypedQuery<Users> query = em.createQuery(jpql,Users.class);
			query.setParameter("id", key);
			return query.getSingleResult();
		} catch (Exception e) {
		}
		return null;
	}

	@Override
	public List<Users> findAll() {
		String jpql = "SELECT u FROM Users u";
		TypedQuery<Users> query = em.createQuery(jpql,Users.class);
		return query.getResultList();
	}
	
	public static Users getUser(String pass, Integer id) {
		try {
			String jpql = "SELECT u FROM Users u WHERE u.id=:id  AND u.password =:pass";
			TypedQuery<Users> query = em.createQuery(jpql,Users.class);
			query.setParameter("id", id);
			query.setParameter("pass", pass);
			return query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public  List<Users> getUserLikeVideo(Integer keys){
		try {
			String jqpl = "SELECT f.user FROM Favorite f WHERE f.video.id = :videoID";
			TypedQuery<Users> query = em.createQuery(jqpl, Users.class);
			query.setParameter("videoID", keys);
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
}

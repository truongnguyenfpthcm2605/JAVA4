package com.poly.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.poly.util.JpaProgram;

import javax.persistence.Query;



public class DAO<T> {
	public static final EntityManager em = JpaProgram.getEntityManager();

	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		em.close();
		super.finalize();
	}

	public T findByid(Class<T> clazz, Integer id) {
		return em.find(clazz, id);
	}

	public List<T> findAll(Class<T> clazz, Boolean existActive) {
		String enityName = clazz.getSimpleName();
		StringBuilder jpql = new StringBuilder();
		jpql.append("SELECT o FROM ").append(enityName).append(" o");
		if (existActive) {
			jpql.append(" WHERE active = 1");
		}
		TypedQuery<T> query = em.createQuery(jpql.toString(), clazz);
		return query.getResultList();
		// SELECT o FROM <T> o WHERE active = :key
	}

	public List<T> findToPage(Class<T> clazz, Boolean existActive, int pageNumber, int pageSize) {
		String enityName = clazz.getSimpleName();
		StringBuilder jpql = new StringBuilder();
		jpql.append("SELECT o FROM ").append(enityName).append(" o");
		if (existActive) {
			jpql.append(" WHERE active = 1");
		}
		TypedQuery<T> query = em.createQuery(jpql.toString(), clazz);
		query.setFirstResult((pageNumber - 1) * pageSize);
		query.setMaxResults(pageSize);
		return query.getResultList();
	}

	public T findOne(Class<T> clazz, String sql, Object... params) {
		// select o from users o where o.id =?0 and o.name =?1
		TypedQuery<T> quey = em.createQuery(sql, clazz);
		for (int i = 0; i < params.length; i++) {
			quey.setParameter(i, params[i]);
		}
		List<T> list = quey.getResultList();
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	public List<T> findMany(Class<T> clazz, String sql, Object... params) {
		// select o from users o where o.id =?0 and o.name =?1
		TypedQuery<T> quey = em.createQuery(sql, clazz);
		for (int i = 0; i < params.length; i++) {
			quey.setParameter(i, params[i]);
		}
		return quey.getResultList();

	}
	
	public List<T> findManyPage(Class<T> clazz, String sql,int pageNumber,int pageSize, Object... params) {
		// select o from users o where o.id =?0 and o.name =?1
		TypedQuery<T> query = em.createQuery(sql, clazz);
		for (int i = 0; i < params.length; i++) {
			query.setParameter(i, params[i]);
		}
		query.setFirstResult((pageNumber - 1) * pageSize);
		query.setMaxResults(pageSize);
		return query.getResultList();

	}

	public List<Object[]> findManyNative(Class<T> clazz, String sql, Object... params) {
		Query quey = em.createNativeQuery(sql, clazz);
		for (int i = 0; i < params.length; i++) {
			quey.setParameter(i, params[i]);
		}
		return quey.getResultList();

	}

	public boolean insert(T enity) {
		try {
			em.getTransaction().begin();
			em.persist(enity);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
		return false;
	}

	public boolean update(T enity) {
		try {
			em.getTransaction().begin();
			em.merge(enity);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
		return false;
	}

	public boolean delete(T enity) {
		try {
				em.getTransaction().begin();
				em.remove(enity);
				em.getTransaction().commit();
				return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
		return false;
	}

}

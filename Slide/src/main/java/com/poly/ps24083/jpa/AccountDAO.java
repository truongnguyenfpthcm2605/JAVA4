package com.poly.ps24083.jpa;

import java.util.List;

import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class AccountDAO {
		private EntityManager em = JpaUtils.getEntityManager();

		@SuppressWarnings("deprecation")
		@Override
		protected void finalize() throws Throwable {
			em.close();
			super.finalize();
		}
		
		public Account create(Account ac) {
			try {
				em.getTransaction().begin();
				em.persist(ac); // them moi
				em.getTransaction().commit();
				return ac;
			} catch (Exception e) {
				em.getTransaction().rollback();
				throw new RuntimeException(e);
			}
		}
		public Account Update(Account ac) {
			try {
				em.getTransaction().begin();
				em.merge(ac); // cap nhat
				em.getTransaction().commit();
				return ac;
			} catch (Exception e) {
				em.getTransaction().rollback();
				throw new RuntimeException(e);
			}
		}
		public Account remove(int id) {
			try {
				Account ac = this.findById(id) ;
				em.getTransaction().begin();
				em.remove(ac); // xoa
				em.getTransaction().commit();
				return ac;
			} catch (Exception e) {
				em.getTransaction().rollback();
				throw new RuntimeException(e);
			}
		}
		
		public Account findById(int id) {
			Account ac = em.find(Account.class, String.valueOf(id));
			return ac;
		}
		
		public List<Account> findAll(){
			String jpql = "SELECT o FROM Account o";
			TypedQuery<Account> query = em.createQuery(jpql,Account.class);
			List<Account> list = query.getResultList();
			return list;
		}
		
}

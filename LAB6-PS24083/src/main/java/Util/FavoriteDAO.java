package Util;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Favorite;

public class FavoriteDAO{
	public static EntityManager em = JpaProgram.getEntityManager();
	public int deleteFavorite(Integer key) {
		try {
			em.getTransaction().begin();
			Favorite us= findById(key);
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
	public Favorite findById(Integer key) {
		try {
			String jpql = "SELECT u FROM Favorite u WHERE u.id=:id ";
			TypedQuery<Favorite> query = em.createQuery(jpql,Favorite.class);
			query.setParameter("id", key);
			return query.getSingleResult();
		} catch (Exception e) {
		}
		return null;
	}
	public  List<Integer> getYearfavorite(){
		try {
			String sql = "select year(likedate) from favorite group by year(likedate)";
			Query query = em.createNativeQuery(sql);
			return query.getResultList();
		} catch (Exception e) {		
			e.printStackTrace();
		}
		return null;
	}


}

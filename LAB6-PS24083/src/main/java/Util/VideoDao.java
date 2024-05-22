package Util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Favorite;
import model.Video;

public class VideoDao  extends DAO<Video, Integer>{
	public static EntityManager em = JpaProgram.getEntityManager();
	@Override
	public int insert(Video enity) {
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
	public int update(Video enity) {
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
			Video us= findById(key);
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
	public Video findById(Integer key) {
		try {
			String jpql = "SELECT u FROM Video u WHERE u.id=:id ";
			TypedQuery<Video> query = em.createQuery(jpql,Video.class);
			query.setParameter("id", key);
			return query.getSingleResult();
		} catch (Exception e) {
		}
		return null;
	}

	@Override
	public  List<Video> findAll() {
		String jpql = "SELECT u FROM Video u";
		TypedQuery<Video> query = em.createQuery(jpql,Video.class);
		return query.getResultList();
	}
	
	public  List<Video> findTitle(String title){
		try {
			String jpql = "SELECT   o.video FROM Favorite o WHERE o.video.title LIKE :key";		
			TypedQuery<Video> query = em.createQuery(jpql, Video.class);
			query.setParameter("key", "%"+title+"%" );
			List<Video> list = query.getResultList();
			Set<Video> set = new HashSet<Video>(list);
			list.clear();
			list.addAll(set);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public  List<Video> getVideoFavoriteOrNot(boolean check){
		String jpql ;
		if(check) {
			jpql = "SELECT o FROM Video o WHERE o.favorites IS NOT EMPTY";
		}else {
			jpql = "SELECT o FROM Video o WHERE o.favorites IS  EMPTY";
		}
		
		try {
			TypedQuery<Video> query = em.createQuery(jpql,Video.class);
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

	
	
	
	


}

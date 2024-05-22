package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaProgram {
	private static EntityManagerFactory factory;
	
	static public EntityManager getEntityManager() {
		if(factory==null || !factory.isOpen()) {
			factory = Persistence.createEntityManagerFactory("SLIDE6");
		}
		return factory.createEntityManager();
	}
	static public void shutdown() {
		if(factory!=null && factory.isOpen()) {
			factory.close();
		}
		factory =null;
	}
	


}

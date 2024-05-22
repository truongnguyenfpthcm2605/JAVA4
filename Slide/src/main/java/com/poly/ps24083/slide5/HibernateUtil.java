package com.poly.ps24083.slide5;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private final static SessionFactory FACTORY;
	
	static {
		
		// cấu hinh server
		Configuration configuration = new Configuration();
		Properties properties = new Properties();
		properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
		properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
		properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=SLIDE5;encrypt=true;trustServerCertificate=true");
		properties.put(Environment.USER, "sa");
		properties.put(Environment.PASS, "123456");
		
		// ad class Persistence
		configuration.addAnnotatedClass(Class.class);
		configuration.addAnnotatedClass(Users.class);
		
		
		configuration.setProperties(properties);
		ServiceRegistry registry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		FACTORY = configuration.buildSessionFactory(registry);
	}
	public static SessionFactory getSessionFactory() {
		return FACTORY;
	}
	
}

package com.brpan.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory SESSION_FACTORY;
	
	static {
		Configuration cfg = new Configuration().configure();
		cfg.configure();
		SESSION_FACTORY = cfg.buildSessionFactory();
	}

	private HibernateUtil() {}
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
	
	public static Session getSession() {
		return SESSION_FACTORY.openSession();
	}
	
	public static void close(Session session) {
		if(session!=null && session.isOpen()) {
			session.close();
		}
	}
	
	public static void closeSessionFactory() {
		if(SESSION_FACTORY!=null&&SESSION_FACTORY.isOpen()){
			
			SESSION_FACTORY.close();
		}
	}
}

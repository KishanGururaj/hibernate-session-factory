package com.wolken.wolkenapp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	private static SessionFactory factory=null;
	public static SessionFactory getFactory() {
		return factory;
	}
	static {
		Configuration configuration=new Configuration();
		configuration.configure();
		factory=configuration.buildSessionFactory();
	}

}

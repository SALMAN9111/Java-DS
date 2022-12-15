package com.example.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.model.UserDetails;

public class TransientPersistanceTest {

	public static void main(String[] args) {

//		UserDetails user = new UserDetails();
//		user.setUserName("Test User");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

//		session.save(user);
////After save statement if any statement comes like set user Hibernate will update that user.
//		user.setUserName("Updated User");

		UserDetails user = session.get(UserDetails.class, 2);

		session.getTransaction().commit();
		session.close();

		user.setUserName("Test User");
		session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(user);

		session.getTransaction().commit();
		session.close();

		System.out.println("Application Ended");
	}

}

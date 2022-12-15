package com.example.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.model.UserDetails;

public class VersionTest {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();

			@Override
			public void run() {
				UserDetails user1 = session.get(UserDetails.class, 3);
				if (user1 != null) {
					session.beginTransaction();
					try {
						Thread.sleep(7000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					user1.setUserName("New T1 User");
					session.update(user1);
					session.getTransaction().commit();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();

			@Override
			public void run() {
				UserDetails user = session.get(UserDetails.class, 3);
				if (user != null) {
					session.beginTransaction();
					user.setUserName("New T2 User");
					session.update(user);
					session.getTransaction().commit();
				}
			}
		});
		
		t1.start();
		t2.start();

	}
}
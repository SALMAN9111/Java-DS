package com.example.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.model.UserDetails;

public class Test {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

//create:
		for (int i = 0; i < 10; i++) {
			UserDetails user = new UserDetails();
			user.setUserName("User: " + i);
			session.save(user);
		}
//		Table is created so there are commented

//Read:
//		UserDetails user1 = (UserDetails) session.get(UserDetails.class, 6);
//		System.out.println("User Name: " + user1.getUserName());

//Delete:
//		UserDetails user1 = (UserDetails) session.load(UserDetails.class, 6);
//		session.delete(user1);

//		UserDetails user1 = (UserDetails) session.get(UserDetails.class, 5);
//		user1.setUserName("User Updated");
//		session.update(user1);

		session.getTransaction().commit();
		session.close();

	}
}

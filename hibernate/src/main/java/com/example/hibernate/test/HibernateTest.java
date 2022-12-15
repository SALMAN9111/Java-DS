package com.example.hibernate.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.model.Address;
import com.example.hibernate.model.UserDetails;
import com.example.hibernate.model.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();

		user.setUserName("Frank");
//		user.setDate(new Date());
//		user.setPhone("767885676");

		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("car");
		

		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("jeep");
		
		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle2);
		
		vehicle.setUser(user);
		vehicle2.setUser(user);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.save(vehicle2);
		session.getTransaction().commit();
		session.close();
		
		
		
	}

}


//Address addr = new Address();
//addr.setCity("Bijapur");
//addr.setPincode("586101");
//addr.setState("Karnataka");
//addr.setStreet("Home Street");
//
//user.getListOfAddress().add(addr);
//
//Address user1HomeAddr = new Address();
//user1HomeAddr.setCity("Some Place");
//user1HomeAddr.setPincode("Some pin");
//user1HomeAddr.setState("Dead state");
//user1HomeAddr.setStreet("nowhere");
//
//user.getListOfAddress().add(user1HomeAddr);
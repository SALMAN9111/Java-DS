package com.example.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.hibernate.model.FourWheeler;
import com.example.hibernate.model.TwoWheeler;
import com.example.hibernate.model.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("car");

		TwoWheeler bike = new TwoWheeler();
		bike.setVehicleName("Bike");
		bike.setSreeingHandle("Bike Streering Handle");

		FourWheeler car = new FourWheeler();
		car.setVehicleName("Car");
		car.setSreeingHandle("Car Streeing Handle");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(vehicle);
		session.save(bike);
		session.save(car);
		session.getTransaction().commit();
		session.close();

	}

}

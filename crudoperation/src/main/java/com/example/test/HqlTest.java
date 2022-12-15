package com.example.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.example.hibernate.model.UserDetails;

@SuppressWarnings("deprecation")
public class HqlTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

//Using Criteria object
		Criteria criteria = session.createCriteria(UserDetails.class).addOrder(Order.desc("userId"));
//				.setProjection(Projections.max("userId"));
//		criteria.add(Restrictions.eq("userName", "User: 9"));

		List<UserDetails> users = criteria.list();
		session.getTransaction().commit();
		session.close();

		for (UserDetails u : users) {
			System.out.println(u.getUserName() + "-" + u.getId());
		}

	}
}
//String minUserId = "5";
//String userName = "user: 9";
////@SuppressWarnings("rawtypes")                                                     :userId             :userName
//Query query = session.createQuery(" select userName from UserDetails where userId > ?1 and userName = ?2" );// where
//query.setParameter(1, Integer.parseInt(minUserId));
//query.setParameter(2, userName);
//
////: 
////query.setInteger("userId", Integer.parseInt(minUserId))
////query.setString("userName", userName);
//																									// 5
////max(userId)
//
//// Below 2 line are pagination.
////query.setFirstResult(5);// It will pull result from the given number in parameter.
////query.setMaxResults(4);// It will pull Four records from list of records.
//
//@SuppressWarnings({ "unchecked" })
//---------------------------------------NAme Query
//Query query = session.getNamedQuery("UserDetails.byId");
//Query query = session.getNamedQuery("UserDetails.byName");
//query.setString(1,"User: 9" );

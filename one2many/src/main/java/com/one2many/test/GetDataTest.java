package com.one2many.test;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.one2many.model.Answer;
import com.one2many.model.Question;

public class GetDataTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		@SuppressWarnings("rawtypes")
		TypedQuery query = session.createQuery("from Question");
		@SuppressWarnings("unchecked")
		List<Question> list = query.getResultList();

		Iterator<Question> itr = list.iterator();
		while (itr.hasNext()) {
			Question q = itr.next();
			System.out.println("Question Name: " + q.getQname());

			// printing answers
			List<Answer> list2 = q.getAnswers();
			Iterator<Answer> itr2 = list2.iterator();
			while (itr2.hasNext()) {
				Answer a = itr2.next();
				System.out.println(a.getAnswername() + ":" + a.getPostedBy());
			}
		}
		session.close();
		System.out.println("success");
	}

}

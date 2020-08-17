package com.kadum.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kadum.hibernate.entity.Users;

public class App {
	public static void main(String[] args) {
		 SessionFactory factory = new Configuration()
				 					.configure("hibernate.cfg.xml")
				 					.addAnnotatedClass(Users.class)
				 					.buildSessionFactory();
		 Session session = factory.getCurrentSession();
		 
		 
		 try {			  
			  // Start transaction
			  session.beginTransaction();
			  
			  @SuppressWarnings("unchecked")
			List<Users> users = session.createQuery("from users").getResultList();
			  
			  for (Users temp : users) {
				System.out.println(temp);
			}
			  
			  // Commit the transaction 
//			  session.getTransaction().commit();
			
		} finally {
			session.close();
			factory.close();
		}
		 
	}
}
 
package com.kadum.hibernate;


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
			  
			 session.createQuery("update users set password='hello' where first_name='kadum'"
					+ "or lastName='pertin' ").executeUpdate();
	
			  
			  // Commit the transaction 
			  session.getTransaction().commit();
			
		} finally {
			session.close();
			factory.close();
		}
		 
	}
}
 
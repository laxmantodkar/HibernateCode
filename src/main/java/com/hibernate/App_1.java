package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App_1 {

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
        // set location of cfg file
		cfg.configure("Hibernate.cgf.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//transation is start
		Transaction tx = session.beginTransaction();
		
		
		Adress ad=new Adress();
	     ad.setStreet("sangli");
	     ad.setOpen(true);
	     ad.setX(2000);
	       
	     //==========================================  
			
			
			//save object
			//session.save(st);
			session.save(ad);
			//save transation
			tx.commit();
			//close session
			session.close();
			System.out.println("Done.");

	}

}

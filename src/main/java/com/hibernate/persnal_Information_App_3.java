package com.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class persnal_Information_App_3 
{

	public static void main(String[] args) throws IOException
	{
		

		System.out.println("Project started");
		Configuration cgf = new Configuration();
		cgf.configure("Hibernate.cgf.xml");
		SessionFactory factory = cgf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		
		Persnal_Information obj=new Persnal_Information();
		
		obj.setF_name("Lata");
		obj.setL_name("Todkar");
		obj.setAge(27);
		obj.setNumber(730);
		obj.setEmail("Todkarlata628@gmail.com");
		obj.setGender("Female");
		
       Persnal_Information object=new Persnal_Information();
		
		object.setF_name("Laxman");
		object.setL_name("Todkar");
		object.setAge(25);
		object.setNumber(8600);
		object.setEmail("Todkarlaxman628@gmail.com");
		object.setGender("male");
		
		session.save(object);
		session.save(obj);
		tx.commit();
		session.close();
		
	
		
		
		
	}

}

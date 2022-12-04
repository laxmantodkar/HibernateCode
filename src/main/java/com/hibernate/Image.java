package com.hibernate;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity

public class Image
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cgf.xml");
		SessionFactory factory = cfg.buildSessionFactory();	
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Image img=new Image();
		
		
	}
	


}

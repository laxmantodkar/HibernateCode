package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Packages {

	public static void main(String[] args) 
	{
	  Configuration cfg=new Configuration();
	  SessionFactory factory=cfg.buildSessionFactory();
	  Session session=factory.openSession();
	  
	  

	}

}

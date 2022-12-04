package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class College_Information_Driver 
{
	public static void main(String[] args)
	{
		System.out.println("project Started");
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cgf.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		College_Information info=new College_Information();
		info.setCollegeName("Fabtech Technical Campus");
	    info.setCollegeLoction("Sangola");
		info.setCollegeDistrict("Solapur");
		info.setNumberOfStudent(300);  
		
		
		College_Information info2=new College_Information();
		info2.setCollegeName("Jath highSchool jath");
	    info2.setCollegeLoction("jath");
		info2.setCollegeDistrict("Sangli");
		info2.setNumberOfStudent(200);
		
		
		
		session.save(info);
		session.save(info2);
		tx.commit();
		
		session.close();
		System.out.println("Table Created");
		

	}

}

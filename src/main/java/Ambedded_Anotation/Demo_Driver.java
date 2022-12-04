package Ambedded_Anotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo_Driver {

	public static void main(String[] args) 
	{
		
         System.out.println("Project start");
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cgf.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		Demo d=new Demo();
		d.setName("Laxman");
		s.save(d);
		
		Demo d1=new Demo();
		d1.setName("Akshata");
		s.save(d1);
		
		Demo d2=new Demo();
		d2.setName("Manisha");
		s.save(d2);
		
		Demo d3=new Demo();
		d3.setName("Lata");
		s.save(d3);
		
		tx.commit();
		s.close();
		factory.close();
	    System.out.println("Project end");
		}

}

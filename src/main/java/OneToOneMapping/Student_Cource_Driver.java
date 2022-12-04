package OneToOneMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class Student_Cource_Driver {

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cgf.xml");
        Scanner s=new Scanner(System.in);
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
//====================================
		
//		Student s1=new Student();
//		System.out.println("Enter student name");
//		String name=s.nextLine();
//		s1.setName(name);
//		
//	
//		System.out.println("Enter student Mobile Number");
//		int number=s.nextInt();
//		s1.setMobileNumber(number);
//		
//		System.out.println("Enter student Email");
//		String email=s.next();
//		s1.setEname(email);
//		
//		System.out.println("Enter student Age");
//		int age=s.nextInt();
//		s1.setAge(age);
//		   
//		
//
//		Course c1=new Course();
//		System.out.println("Enter student course");
//		String course=s.next();
//		c1.setCource(course);
//		
//		System.out.println("Enter course duration");
//		int duration=s.nextInt();
//		c1.setDuration(duration);
//		
//		System.out.println("Enter  course Fee");
//		int fee=s.nextInt();
//		c1.setFree(fee);
//		c1.setStd(s1);
//		s1.setCourceId(c1);
//	
//		session.save(c1);
//		session.save(s1);
//		tx.commit();
		
		System.out.println("Data saved");
		
		
		String q=" from  Course ";
	     Query result = session.createQuery(q);
	     List<Course> list = result.getResultList();
	     for(Course a:list)
	     {
	    	 System.out.println(a);
	     }

		session.close();
		factory.close();
		

	}

}

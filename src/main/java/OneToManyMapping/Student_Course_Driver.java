package OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Student_Course_Driver {

	public static void main(String[] args) 
	{
		 Configuration cfg=new Configuration();
		 cfg.configure("Hibernate.cgf.xml");
		 SessionFactory factory=cfg.buildSessionFactory();
		 Session session=factory.openSession();
		 Transaction tx=session.beginTransaction();
//=========================================	
		 //Creteting question
		 Student s1=new Student();
		 s1.setId(101);
		 s1.setName("Name_1");
		 s1.setLastName("LastName_1");
		 
		 Student s2=new Student();
		 s2.setId(102);
		 s2.setName("Name_2");
		 s2.setLastName("LastName_2");
		 
		 Student s3=new Student();
		 s3.setId(103);
		 s3.setName("Name_3");
		 s3.setLastName("LastName_3");
		 
//===============================================	4
	 //Creating answer
		 Course c1=new Course();
		 c1.setId(201);
		 c1.setCourse("course_1");
		 c1.setDuration(4);
		 c1.setStd(s1);
		 
		 Course c2=new Course();
		 c2.setId(202);
		 c2.setCourse("course_1");
		 c2.setDuration(2);
		 c2.setStd(s1);
		 
		 Course c3=new Course();
		 c3.setId(203);
		 c3.setCourse("course_2");
		 c3.setDuration(1);
		 c3.setStd(s2);
		 
		 Course c4=new Course();
		 c4.setId(204);
		 c4.setCourse("course_3");
		 c4.setDuration(5);
		 c4.setStd(s3);
		 
		 List<Course> list=new ArrayList();
		 list.add(c1);
		 list.add(c2);
		 list.add(c3);
		 list.add(c4);
		 
		 s1.setCourse(list);
		 
		 
		  session.save(s1);
		  session.save(s2);
		  session.save(s3);

		  session.save(c1);
		  session.save(c2);
		  session.save(c3);
		  session.save(c4);
		  
		  
		  tx.commit();
		  session.close();
		  factory.close();
		 
	}

}

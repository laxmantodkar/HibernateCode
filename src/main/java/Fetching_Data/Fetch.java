package Fetching_Data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import OneToManyMapping.Course;
import OneToManyMapping.Student;

public class Fetch {

	public static void main(String[] args) {
				 Configuration cfg=new Configuration();
				 cfg.configure("Hibernate.cgf.xml");
				 SessionFactory factory=cfg.buildSessionFactory();
				 Session session=factory.openSession();
				 Transaction tx=session.beginTransaction();
//				  Student s=new Student();
//				  
//				 Student student = session.get(Student.class, 101);
//				System.out.println(student.getId());
				String q="from course";
				Query Query = session.createQuery(q);
				List<Course> list = Query.list();
				for(Course student:list)
				{
					System.out.println(student.getId());
					System.out.println("==========");
				}
				session.close();
				factory.close();
				
			}

		}

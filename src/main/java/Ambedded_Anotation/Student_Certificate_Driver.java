package Ambedded_Anotation;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Student_Certificate_Driver 
{

	public static void main(String[] args)
	{
		System.out.println("Project Start");
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cgf.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		 Session session=factory.openSession();
		 Transaction tx=session.beginTransaction();
		 
		 Student student=new Student();
		 student.setName("Lxman");
		 student.setCity("Jath");
		 
		 Certificate c=new Certificate();
		 c.setCourse("java");
		 c.setDuration("3");
		 student.setCerti(c);
		
		 
		 Deparment d=new Deparment();
		 
		 d.setdeparment(101);
		 d.setdeptName("Cleark");
		 student.setDept(d);
		 session.save(d);
		 
		 session.save(student);
//		 Student student1=new Student();
//		 student1.setName("Akshata");
//		 student1.setCity("Jath");
//		
//		 Certificate c1=new Certificate();
//		 c1.setCourse("SQL");
//		 c1.setDuration("2");
//		 student1.setCerti(c1);
//		 
//		 session.save(student1);
		 
		 tx.commit();
		 session.close();
		 factory.close();
		 
		
		

	}

}

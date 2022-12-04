package OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Qustion_1Answer_1Driver {

	public static void main(String[] args) 
	{
		 Configuration cfg=new Configuration();
		 cfg.configure("Hibernate.cfg.xml");
		 SessionFactory factory=cfg.buildSessionFactory();
		 Session session=factory.openSession();
		 Transaction tx=session.beginTransaction();
//==========================================
		 Question_1 q1=new Question_1();
		 q1.setQuestionId(11);
		 q1.setQuestion("Question_1");
		 
		 Answer_1 a1=new Answer_1();
		 a1.setAnswerid(21);
		 a1.setAnswer("Answer_1");
		//s q1.set
		 
		 
		 
		 
		 
	
		 
		 tx.commit();
		 session.close();
		 factory.close();
		 
		 	

	}

}

package OneToOneMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Question_Answer_Driver 
{
 public static void main(String[] args) 
 {
	Scanner s=new Scanner(System.in);
	 Configuration cfg=new Configuration();
	 cfg.configure("NewFile.xml");
	 SessionFactory factory=cfg.buildSessionFactory();
	 Session session=factory.openSession();
	 Transaction tx=session.beginTransaction();
	//===================================== 
//	Question q=new Question();
//	System.out.println("Enter Question");
//	String question=s.nextLine();
//	q.setQuestion(question);
//	
//	Answer a=new Answer();
//	System.out.println("Enter Answer");
//	String ans=s.nextLine();
//	a.setAnswer(ans);
//	q.setAns(a);
//	a.setQuestion(q);
//	session.save(q);
//	session.save(a);
//	 tx.commit();
	 System.out.println("Data saved");
	 
   Query q = session.createQuery("Select q.Question,a. Answer from Question as q INNER JOIN q.Ans as a");
	 
List<Object []> list = q.getResultList();
for(Object[] arr:list)
{
	System.out.println(Arrays.toString(arr));
}
tx.commit();
	 session.close();
	 factory.close();
}
}

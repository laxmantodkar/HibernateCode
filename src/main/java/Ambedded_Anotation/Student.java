package Ambedded_Anotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
   private int id;
	@Column(name="Name", length=10)
   private String name;
	private String city;
	
   private Certificate certi;
   
   private Deparment dept;
   
   public Deparment getDept() {
	return dept;
}
public void setDept(Deparment dept) {
	this.dept = dept;
}
public Student (int id,String name,String city)
   {
	   this.id=id;
	   this.name=name;
	   
   }
   public Student()
   {
	   super();
   }
   public void setCity(String city)
   {
	   this.city=city;
   }
   public void setId(int id)
   {
	   this.id=id;
   }
   public void setName(String name)
   {
	   this.name=name;
   }
   
  public void setCerti(Certificate certi) 
  {
	this.certi = certi;
  }
   
}

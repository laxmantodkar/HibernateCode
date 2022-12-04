package Ambedded_Anotation;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate 
{
	
  private String course;
  private String duration;
  
  public Certificate(String course, String duration) 
{
	  
	this.course = course;
	this.duration = duration;
}

 public Certificate() 
{
	super();
	
}

public void setCourse(String course) 
{
	this.course = course;
}

public void setDuration(String duration) 
{
	this.duration = duration;
}
  
}

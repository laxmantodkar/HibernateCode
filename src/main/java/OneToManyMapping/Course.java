package OneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course 
{
	@Id
   private int id;
   private String course;
   private int duration;
   @ManyToOne
   private Student std;
public Course(int id, String course, int duration, Student std) {
	super();
	this.id = id;
	this.course = course;
	this.duration = duration;
	this.std = std;
}
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public Student getStd() {
	return std;
}
public void setStd(Student std) {
	this.std = std;
}

	

   
   
}

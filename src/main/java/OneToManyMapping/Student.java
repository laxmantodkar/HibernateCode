package OneToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student
{
	@Id
	private int id;
	private String name;
	private String lastName;
	@OneToMany
	private List<Course> course;
	public Student(int id, String name, String lastName, List<Course> course) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	} 
	
	
	

}

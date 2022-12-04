package OneToOneMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student 
{
	@Id
	@Column(name="Student_Id",length=4)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="Student_Name")
	private String name;
	@Column(name="Student_MobileNumber")
	private int mobileNumber;
	@Column(name="Student_Email")
	private String ename;
	@Column(name="Student_Age")
	private int age;
	@OneToOne
	@JoinColumn(name="Cource_id")
	public Course courceId ;

	public Student(int id, String name, int mobileNumber, String ename, int age, Course courceId) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		ename = ename;
		age = age;
		this.courceId = courceId;
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

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Course getCourceId() {
		return courceId;
	}

	public void setCourceId(Course courceId) {
		this.courceId = courceId;
	}

	
	}
  


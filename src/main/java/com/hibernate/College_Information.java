package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="College_Information")
public class College_Information
{
	@Column(name="College_Name")
	private String CollegeName;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int CollegeId;
	@Column(name="College_Location",length=10)
	private String CollegeLocation;
	@Column(name="College_District",length=9)
	private String CollegeDistrict;
	@Transient//Dot not create column in table
	private int numberOfStudent;
	
	public College_Information(String CollegeName,int CollegeId, String CollegeLocation,String CollegeDistrict)
	{
		this.CollegeName=CollegeName;
		this.CollegeId=CollegeId;
		this.CollegeLocation=CollegeLocation;
		this.CollegeDistrict=CollegeDistrict;
	
	}
	public College_Information()
	{
		super();
	}
	public void setCollegeName(String Name)
	{
		 this.CollegeName=Name;
	}
	public void setCollegeId(int  id )
	{
		this.CollegeId=id;
		
	}
	public void setCollegeLoction(String Location)
	{
		this.CollegeLocation=Location;
		
	}
	public void setCollegeDistrict(String District)
	{
		this.CollegeDistrict=District;
	}
	public void setNumberOfStudent(int Student) {
		this.numberOfStudent=Student;
	}


}

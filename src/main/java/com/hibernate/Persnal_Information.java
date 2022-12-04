package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Persnal_Information 
{
	@Id
	private int id;
	private String Image;
	@Column(name="Fist_Name")
	private String F_name;
	@Column (name="Last_Name")
	private String L_name;
	@Column(name="Age")
	private int Age;
	
	private String Gender;
	
     @Column(name="Mobile_number")
	private long Number;
	
	private String Email;

	public Persnal_Information(String f_name, String l_name, int age, String gender, long number, String email) 
	{

		F_name = f_name;
		L_name = l_name;
		Age = age;
		Gender = gender;
		Number = number;
		Email = email;
	}
      public Persnal_Information()
      {
    	  super();
      }
	

	public void setF_name(String f_name) {
		F_name = f_name;
	}

	
	public void setL_name(String l_name) {
		L_name = l_name;
	}

	

	public void setAge(int age) {
		Age = age;
	}

	
	public void setGender(String gender) {
		Gender = gender;
	}

	

	public void setNumber(long number) {
		Number = number;
	}

	

	public void setEmail(String email) {
		Email = email;
	}



	public void setImage(byte[] data) 
	{
	
		
	}
	

}

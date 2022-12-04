package com.hibernate;

import java.beans.Transient;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Student_Address")
public class Adress 
{

	@Id//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)//Id value automatic increased
	@Column(name="Addres_id")// Give Change column Name
	private int addressId;
//======================================================	
	@Column(length=50, name="city")//change length of columN
	private String Street;
//=========================================================	
	@Column(name="is_open")// give Change column Name
	private boolean isOpen;
//====================================================	
	//@Transient//do not create any coloumn inside the table using this annotation
	private double x;
//=======================================================	
	
	private Byte [] image;
//========================================================	
	public Adress(int addressId, String street, boolean isOpen, double x, Byte[] image)
	{
		super();
		this.addressId = addressId;
		Street = street;
		this.isOpen = isOpen;
		this.x = x;
		this.image = image;
	}
	public int getAddressId() 
	{
		return addressId;
	}
	public void setAddressId(int addressId)
	{
		this.addressId = addressId;
	}
	public String getStreet() 
	{
		return Street;
	}
	public void setStree(String street) 
	{
		Street = street;
	}
	public boolean isOpen()
	{
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Byte[] getImage() {
		return image;
	}
	public void setImage(Byte[] image) {
		this.image = image;
	}
	public Adress() {
		super();
		
	}
	public void setStreet(String street2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}

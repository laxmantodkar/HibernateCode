package Ambedded_Anotation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Demo 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	public Demo(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}
	public Demo() 
	{
		super();
	}
	public void setName(String name)
	{
		this.name=name;
	}

}

package Ambedded_Anotation;

import javax.persistence.Embeddable;

@Embeddable
public class Deparment 
{
	private int deparment;
	private String deptName;
	public Deparment(int deparment, String deptName)
	{
		super();
		this.deparment = deparment;
		this.deptName = deptName;
	}
	public Deparment() {
		super();
		
	}
	public void setdeparment(int deparmentId)
	{
		this.deparment=deparmentId;
		
	}
	public void setdeptName(String deptName)
	{
		this.deptName=deptName;
	}

}

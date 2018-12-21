package com.techlabs.contact;

public class ContactConstructor {
	private String name;
	private String lname;
	private String phoneNo;
	private int salary;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setLname(String lname)
	{
		this.lname=lname;
	}
	public void setphoneNo(String phoneNo )
	{
		this.phoneNo=phoneNo;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	
	public String getName()
	{
		return name;
	}
	public String getLname()
	{
		return lname;
	}
	public String getPhoneNumber()
	{
		return phoneNo;
	}
	public double getSalary()
	{
		return salary;
	}

}

package com.techlabs.contactapp;

import java.io.Serializable;

public class Contact {
	private String fname;
	private String lname;
	private String phoneNo;
	
	public Contact(String fname,String lname,String phoneNo)
	{
		this.fname=fname;
		this.lname=lname;
		this.phoneNo=phoneNo;
	}
	public String getFname()
	{
		return fname;
	}
	public String getLname()
	{
		return lname;
	}
	public String getPhone()
	{
		return phoneNo;
	}
	public void setFname(String fname)
	{
		this.fname=fname;
	}
	public void setLastName(String lname)
	{
		this.lname=lname;
	}

}

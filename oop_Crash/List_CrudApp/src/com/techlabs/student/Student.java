package com.techlabs.student;

public class Student {
	private String name;
	private int rollNo;
	public Student(String name,int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
	}
	
	public String getName()
	{
		return name;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setRoll(int rollNo)
	{
		this.rollNo=rollNo;
	}
	

}
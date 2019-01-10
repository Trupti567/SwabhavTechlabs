package com.techlabs.mapforobject;

public class Student {
	private int rollNo;
	private int studId;
	private String fname;
	private String lname;
	public Student(int rollNo,int studId,String fname,String lname  )
	{
		this.rollNo=rollNo;
		this.studId= studId;
		this.fname=fname;
		this.lname=lname;
	}
	public int getStudentrollNo()
	{
		return rollNo;
	}
	public int getStudentStd()
	{
		return studId;
	}
	public String getStudentFirstName()
	{
		return fname;
	}
	public String getStudentLastName()
	{
		return lname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNo;
		result = prime * result + studId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNo != other.rollNo)
			return false;
		if (studId != other.studId)
			return false;
		return true;
	}
	

}

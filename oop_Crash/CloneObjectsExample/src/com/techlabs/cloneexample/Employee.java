package com.techlabs.cloneexample;

public class Employee implements Cloneable {
	private int empId;
	private String name;
	private String lastname;

	public Employee(int empId, String name, String lastname) {
		this.empId = empId;
		this.name = name;
		this.lastname = lastname;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setLastame(String lname)
	{
		this.lastname=lname;
	}

	public int getEmpid() {
		return empId;
	}

	public String getFname() {
		return name;
	}

	public String getLname() {
		return lastname;
	}
	@Override
	 public Object clone() throws CloneNotSupportedException {
	 return super.clone();
	 }

	@Override
	public String toString() {
		return String.format(" Name = " + getFname() + " last Name = "
				+ getLname() + " ID " + getEmpid());
	}

}

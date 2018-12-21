package com.techlabs.employee;

import com.techlabs.employee.*;

public class Employee {
	private static final int id=101;
	private String firstname;
	private String lastname;
	private double salary;
	private float commision;
	private EmployeeType employee;
	public Employee(int id,String firstname,String lastname,double salary,float commision,EmployeeType employee  )
	{
		//this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
		this.commision=commision;
		this.employee=employee;
	}
	public Employee()
	{
		
	}
	 
	

	public void setFname(String fname1) {
		firstname = fname1;
	}

	public void setLname(String lname1) {
		lastname = lname1;
	}

	//public void setId(int id1) {
		//id = id1;
	//}

	public void setSalary(double salary1) {
		if (salary1 < 10000) {
			salary = 0;
			System.out.println("Invalid");
		} else {
			salary = salary1;
		}
	}

	public void setCommision(float commision1) {
		if (commision1 > 0 || commision1 <= 1)
			commision = commision1;

	}

	public String getFname() {
		return firstname;
	}

	public String getLname() {
		return lastname;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public float getCommision() {
		return commision;
	}
	public EmployeeType getType()
	{
		return employee;
	}

	public double calculateAnnualSalary() {
		double calculatedCommision = salary * commision;
		return ((calculatedCommision + salary) * 12);

	}

}

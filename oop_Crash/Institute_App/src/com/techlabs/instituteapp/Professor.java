package com.techlabs.instituteapp;

public class Professor extends Person implements ISalariedEmployee {

	public Professor(int id, String address, String dob) {
		super(id, address, dob);

	}
	public double calculateSalary(int noOfHours, double pay) {
		double Salary = noOfHours * pay;
		return Salary;

	}
	

	public String toString() {
		return String.format(" Id = " + getId() + " Address = " + getAddress()
				+ " DOB " + getDob() );
	}

	
	

	
}

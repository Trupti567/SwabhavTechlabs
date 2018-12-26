package com.techlabs.instituteapp;

public class Student extends Person {

	public Student(int id, String address, String dob) {
		super(id, address, dob);

	}

	public Branch getBranch() {
		return Branch.COMPUTER;
	}

	public String toString() {
		return String.format("ID = " + getId() + " DOB= " + getDob()
				+ " Address = " + getAddress() + " Branch = " + getBranch());
	}

}

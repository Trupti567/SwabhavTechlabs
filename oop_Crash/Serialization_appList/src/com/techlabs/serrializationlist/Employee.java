package com.techlabs.serrializationlist;

import java.io.Serializable;

public class Employee implements Serializable {
	private String name;
	private int empId;

	public Employee(String name, int empId) {
		this.empId = empId;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return empId;
	}

	public String toString() {

		return String.format("Name = " + getName() + "Id = " + getId());
	}

}

package com.techlabs.employee.test;

import com.techlabs.employee.Employee;

public class TestAnonymus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new Employee();

		System.out.println(new Employee().getFname());
		printDetails(new Employee());

	}

	public static void printDetails(Employee e) {
		System.out.println("First name=" + e.getFname() + "last name="
				+ e.getLname() + " id is " + e.getId() + " salary is "
				+ e.getSalary() + " commision is " + e.getCommision());
	}

}

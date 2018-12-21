package com.techlabs.employee.test;

import com.techlabs.employee.*;


public class EmployeeTestEnum {
	public static void main(String args[]) {
		Employee employee = new Employee(101, "Trupti", "Mahale", 25000, 2000,
				EmployeeType.FULLTIME);

		Employee employee2 = new Employee(102, "Mamjusha", "Mahale", 30000,
				100, EmployeeType.UNPAID);

		Employee employee3 = new Employee(102, "Aditya", "Gharat", 20000, 1000,
				EmployeeType.PARTIME);
		
		
		printDetails(employee );
		printDetails(employee2);
		printDetails(employee3);
		
		

	}

	public static void printDetails(Employee e) {
		System.out.println(" Name = " + e.getFname() + " " + e.getLname()
				+ " salary = " + e.getSalary() + " Commission = "
				+ e.getCommision() + " Type = " + e.getType());
	}

}

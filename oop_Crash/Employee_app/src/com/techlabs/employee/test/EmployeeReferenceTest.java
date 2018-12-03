package com.techlabs.employee.test;

import com.techlabs.employee.Employee;

public class EmployeeReferenceTest {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setFname("Trupti");
		 printDetails( e1);
		
		
		Employee e2=new Employee();
		e2.setFname("Nikita");
		printDetails( e2);
		
		
		Employee e3=e2;
		e3=null;
		
	
		e3.setFname("Swabhav Techlabs");
		printDetails( e3);
		
		printDetails( e2);
		
		// TODO Auto-generated method stub

	}
	public static void printDetails(Employee e)
	{
		System.out.println("First name="+e.getFname());
	}

}

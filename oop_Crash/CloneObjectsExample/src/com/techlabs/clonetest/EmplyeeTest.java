package com.techlabs.clonetest;

import com.techlabs.cloneexample.Employee;

public class EmplyeeTest {
	public static void main(String args[]) throws CloneNotSupportedException
	{
		
		Employee emp=new  Employee(101, "Trupti", "Mahale");
		System.out.println(emp);
		System.out.println(emp.hashCode());
		Employee emp2=(Employee)emp.clone();
		System.out.println(emp2.hashCode());
		
		System.out.println("Name ="+emp.getFname()+" "+" LastName = "+emp.getLname());
		System.out.println("Name ="+emp2.getFname()+" "+" LastName = "+emp2.getLname());
		emp2.setName("pallavi");
		emp2.setLastame("Mali");
		System.out.println("Name ="+emp2.getFname()+" "+" LastName = "+emp2.getLname());
		System.out.println(emp2.hashCode());
		
		
		
	}
	
	

}

package com.techlabs.test;

import com.techlabs.instituteapp.Professor;
import com.techlabs.instituteapp.Student;

public class Test {
	public static void main(String args[])
	{
		Student student=new Student(101,"10 Aug 2017","Seawoods");
		System.out.println(student);
		Professor professor=new Professor(10, "15 may 1966", "NaviMumbai");
		
		
		System.out.println(professor);
		double salary=professor.calculateSalary(10, 5000);
		System.out.println("Salary is"+salary);
		
	}

}

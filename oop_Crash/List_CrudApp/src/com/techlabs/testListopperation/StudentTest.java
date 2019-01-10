package com.techlabs.testListopperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techlabs.student.CompareByName;
import com.techlabs.student.CompareByRollNo;
import com.techlabs.student.Student;

public class StudentTest {
	public static void main(String args[]) {
		List<Student> students = new ArrayList<Student>();
		Student student = new Student("Trupti", 107);
		Student student1 = new Student("Rikita", 102);
		Student student2 = new Student("Manjusha", 103);
		Student student3 = new Student("Pallavi", 105);
		Student student4=new Student("Janvi",100);
		Student student5=new Student("Limje",10);
		
		students.add(student);
		students.add(student1);
		students.add(student2);
		students.add(student4);
		students.add(student5);
		
		
		System.out.print("Display:-");
		printDetails(students);

		
		System.out.println();
		students.add(student3);

		System.out.print("Adding:-");
		printDetails(students);
		
		System.out.println();
		System.out.print("Updating:-");
	    students.set(0, student);
	    student.setName("Ddity");
	    printDetails(students);
	   
	    System.out.println();
	    System.out.print("Deleting:-");
	    students.remove(3);
	    printDetails(students);
	   
	    System.out.println();
	    System.out.print("After sorting");
	    Collections.sort(students, new CompareByName()); 
	    printDetails(students);
	    
	    System.out.println();
	    System.out.println("After Sorting by roll");
	   Collections.sort(students,new CompareByRollNo() );
	   printDetails(students);
	  
	    
	    
	    
	   
	}
	 public static void printDetails(List<Student> s )
	    {
		 for (Student temp : s) {

				System.out.print(" {name : " + temp.getName() + " Roll no  "
						+ temp.getRollNo() + "}");
			}
	    }

}

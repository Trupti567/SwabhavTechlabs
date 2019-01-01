package com.techlabs.arraylist;

import java.util.ArrayList;

import com.techlabs.student.Student;

public class StudentTest {
	public static void main(String args[]) {
		ArrayList<Student> students = new ArrayList<Student>();
		Student student = new Student("Trupti", 101);
		Student student1 = new Student("Nikita", 102);
		Student student2 = new Student("Manjusha", 103);
		Student student3 = new Student("Pallavi", 105);
		students.add(student);
		students.add(student1);
		students.add(student2);
		System.out.print("Display:-");
		printDetails(students);

		
		System.out.println();
		students.add(student3);

		System.out.print("Adding:-");
		printDetails(students);
		
		System.out.println();
		System.out.print("Updating:-");
	    students.set(0, student);
	    student.setName("Adity");
	    printDetails(students);
	   
	    System.out.println();
	    System.out.print("Deleting:-");
	    students.remove(3);
	    printDetails(students);
	   
	}
	 public static void printDetails(ArrayList<Student> s )
	    {
		 for (Student temp : s) {

				System.out.print(" {name : " + temp.getName() + " Roll no  "
						+ temp.getRollNo() + "}");
			}
	    }

}

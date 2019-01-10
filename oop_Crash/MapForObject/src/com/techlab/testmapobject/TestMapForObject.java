package com.techlab.testmapobject;

import java.util.HashMap;
import java.util.Map;

import com.techlabs.mapforobject.Student;

public class TestMapForObject {
	public static void main(String args[]) {
		Map<Student, Student> studentmap = new HashMap<Student, Student>();
		Student student = new Student(10, 6, "Ajit", "Lahane");
		Student student1 = new Student(10, 6, "Tushar", "Mahale");
		Student student2 = new Student(12, 8, "nimish", "patel");
		Student student3 = new Student(9, 7, "Nikshita", "Sakpal");
		Student student4 = new Student(11, 5, "Janvi", "Agarval");
		Student student5 = new Student(18, 9, "Anisha", "Agarval");
		Student student6 = new Student(11, 10, "Manthan", "Agarval");
		studentmap.put(student, student);
		studentmap.put(student1, student1);
		studentmap.put(student2, student2);
		studentmap.put(student3, student3);
		studentmap.put(student4, student4);
		studentmap.put(student5, student5);
		studentmap.put(student6, student6);
		display(studentmap);
		
		System.out.println(" Details of Students After Deleting Entry : = ");
		studentmap.remove(student5);
		display(studentmap);
		
		
		
		

	}
	public static void display(Map<Student, Student> studentmap)
	{
		for (Map.Entry<Student, Student> entryset : studentmap.entrySet()) {
			Student key = entryset.getKey();
			Student value = entryset.getValue();
			
			System.out.println(" RollNo = " + value.getStudentrollNo()
					+ "  STD = " + value.getStudentStd() + " FirstName = "
					+ value.getStudentFirstName()+" LastName = "+value.getStudentLastName());
		}

		
	}

}

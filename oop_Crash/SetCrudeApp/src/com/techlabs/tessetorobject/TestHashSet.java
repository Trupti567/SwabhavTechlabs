package com.techlabs.tessetorobject;

import java.util.HashSet;

import com.techlabs.setforobjects.StudentForHashset;

public class TestHashSet {
	public static void main(String args[]) {
		HashSet<StudentForHashset> set = new HashSet<StudentForHashset>();
		StudentForHashset student0 = new StudentForHashset(11, "Trupti", "Computer");
		StudentForHashset student1 = new StudentForHashset(11, "Trupti", "Computer");
		StudentForHashset student2 = new StudentForHashset(11, "Manjusha", "Electronics");
		StudentForHashset student3 = new StudentForHashset(12, "Aditya", "Computer");
		StudentForHashset student4 = new StudentForHashset(13, "Ankur", "Mechanical");

		set.add(student0);
		set.add(student1);
		set.add(student2);
		set.add(student3);
		set.add(student4);
		

		displayData(set);

		System.out.println("Delete Record from the set");
		set.remove(student2);
		displayData(set);

	}

	public static void displayData(HashSet<StudentForHashset> set) {
		for (StudentForHashset stud : set) {

			System.out.println(" Name : " + stud.getStudentName() + " Id : "
					+ stud.getStudentId() + " Branch : "
					+ stud.getStudentBranch() + " HashCode " + stud.hashCode());
		}
	}

}

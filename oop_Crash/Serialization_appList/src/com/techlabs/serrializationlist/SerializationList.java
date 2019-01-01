package com.techlabs.serrializationlist;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationList {
	public static void main(String args[]) throws IOException
	{
		ArrayList<Employee> employeelist=new ArrayList<Employee>();
		Employee employee=new Employee("Ridima",101);
		Employee employee1=new Employee("Raquesh",102);
		Employee employee2=new Employee("Anisha",103);
		Employee employee3=new Employee("Arjun",104);
		employeelist.add(employee);
		employeelist.add(employee1);
		employeelist.add(employee2);
		employeelist.add(employee3);
		FileOutputStream fout=new FileOutputStream("C:\\SwabhavRepository\\oop_Crash\\Serialization_appList\\Second.Ser");  
		  ObjectOutputStream out=new ObjectOutputStream(fout); 
		  out.writeObject(employeelist);
		  out.close();
		  System.out.println("Success");
		
	}

}

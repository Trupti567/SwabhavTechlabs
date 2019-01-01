package com.techlabs.deserializelist;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;





import com.techlabs.serrializationlist.Employee;

public class DeserializationList {
	public static void main(String args[]) throws IOException, Throwable
	{
		FileInputStream fin=new FileInputStream("C:\\SwabhavRepository\\oop_Crash\\Serialization_appList\\Second.Ser");
		ObjectInputStream os = new ObjectInputStream(fin);
		ArrayList<Employee> employeelist = (ArrayList<Employee>) os.readObject();
		System.out.println(employeelist);
		os.close();
	}

}

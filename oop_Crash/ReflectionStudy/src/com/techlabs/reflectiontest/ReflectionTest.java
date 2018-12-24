package com.techlabs.reflectiontest;

import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.techlabs.reflectionstudy.Reflection;

public class ReflectionTest {
	public static void main(String args[])
	{
		Reflection reflection=new Reflection(FileWriter.class);
		int no=reflection.noOfConstructors();
		System.out.println("No of Constructors in Class are " +no);
		Method method[]=reflection.noOfMethods();
		int noOfMethods=method.length;
		System.out.println("Number of Methods are"+ noOfMethods);
		for(Method temp:method)
		{
			System.out.println(temp.getName());
		}
		
	}

}

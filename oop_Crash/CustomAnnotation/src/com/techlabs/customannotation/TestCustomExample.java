package com.techlabs.customannotation;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;

public class TestCustomExample {
	public static void main(String args[])
	{
	
		CustomExample example=new CustomExample();
		
		for(Method method:CustomExample.class.getMethods())
		{
			if(method.isAnnotationPresent(ProTest.class))
					{
				 System.out.println(method);
				 
				    
				     
					}
			
		}
	}

}

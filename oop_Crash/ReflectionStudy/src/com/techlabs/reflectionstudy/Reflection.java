package com.techlabs.reflectionstudy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflection {
	private Class cls;
	public Reflection(Class cls) {
		this.cls=cls;
		
	}
	public int noOfConstructors()
	{
		Constructor ct[]=cls.getConstructors();
		int a=ct.length;
		return a;
	}
	public Method[] noOfMethods()
	{
		Method mt[]=cls.getMethods();
		
		return mt;
	}

}

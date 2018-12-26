package com.techlabs.customannotation;

public class CustomExample {
	@ProTest
	public boolean m1()
	{
		System.out.println("End of m1");
		return true;
	}
	
	public boolean m2()
	{
		System.out.println("End of m2");
		return false;
	}
	@ProTest
	public boolean m3()
	{
		System.out.println("End of m3");
		return false;
	}

	public boolean m4()
	{
		System.out.println("End of m4");
		return true;
	}
	
	
	
	

}

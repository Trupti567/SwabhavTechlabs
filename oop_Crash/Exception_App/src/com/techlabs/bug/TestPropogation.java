package com.techlabs.bug;

public class TestPropogation {
	public static void main(String args[])
	{
		try{
		f1();
		}
		catch(Exception ex)
		{
			System.out.println("Thank you");
		}
		System.out.println("Thank you");
		
	}
	static void f1()throws Exception
	{
		f2();
	}
	static void f2()throws Exception
	{
		f3();
	}
	static void f3()throws Exception
	{
		
	}

}

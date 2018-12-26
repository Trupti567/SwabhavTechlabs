package com.techlabs.bug;

public class TestStackTrace {
	public static void main(String args[])
	{
		try{
		f1();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		System.out.println("End of main");
	}
	public static void f1()
	{
		f2();
		
	}
	public static void f2()
	{
		f3();
	}
	public static void f3()
	{
		throw new RuntimeException("Error is in f3");
	}

}

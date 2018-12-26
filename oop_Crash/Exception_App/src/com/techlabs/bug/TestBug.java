package com.techlabs.bug;

public class TestBug {
	public static void main(String args[])
	{
		try{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a/b;
		System.out.println("Result is"+c);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not zero");
		}
		catch(NumberFormatException num)
		{
			System.out.println("Number should be integer value");
		}
		catch(IndexOutOfBoundsException index)
		{
			System.out.println("Values should not empty ");
		}
		System.out.println("Thank you");
		
	}

}

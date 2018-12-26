package com.techlabs.calculater;

public class Calculater {
	public static void main(String args[])
	{
		int a, b;
		try{
		addNumbers(-10, 20);
		}
		catch(NegativeNotSupportException nx)
		{
			System.out.println(nx);
		}
		
		
		
	}
	public static void addNumbers(int num1,int num2)
	{
		if(num1>0&&num2>0)
		{
			System.out.println("Addition is"+(num1+num2));
		}
		else throw new NegativeNotSupportException(num1,num2);
	}

}

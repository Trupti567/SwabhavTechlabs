package com.techlabs.calculator;

public class CalculatorTest {
	public static void main(String args[])
	{
		String numbers="1000,1000,5";
		Calculator calculator=new Calculator();
		int result=calculator.add(numbers);
		
		System.out.println(result);
		
		
	}

}

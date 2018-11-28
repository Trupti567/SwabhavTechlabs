package com.techlabs.array;

public class FizzBuzzProblem {
	public static void main(String args[])
	{
		result(20);
	}
	public static void result(int no)
	{
		if(no%3==0 && no%5==0)
		{
			System.out.println("Fiz Buzz");
		}
		else if(no%5==0)
		{
			System.out.println("Buzz");
		}
		else if(no%3==0)
		{
			System.out.println("Fizz ");
		}
		else
			System.out.println(no);
	}

}

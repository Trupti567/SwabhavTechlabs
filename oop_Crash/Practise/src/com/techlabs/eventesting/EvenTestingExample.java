package com.techlabs.eventesting;

public class EvenTestingExample {
	public static void main(String args[])
	{
	   int number=0;
		for(int i=0;i<1000;i++)
		{
			
			if(i%2==0)
			{
				number=i*2;
		
			}
			else
			{
				
				number=i;
			}
			System.out.println(number);
		}
		
	}

}

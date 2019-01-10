package com.techlabs.occurence;

public class Occurence {
	public static void main(String args[])
	{
		int numbers[]=new int[]{1,2,2,3,4,2};
		int counter=occurence(numbers, 2);
		System.out.println(counter);
		
		
		
	
		
	}
	public static int occurence(int numbers[],int num)
	{
		int count=0;
		for(int i=0;i<numbers.length;i++)
			if(numbers[i]==num)
			{
				count++;
			}
		return count;
	}
	
	
}

package com.techlabs.addition;

public class AdditionArrayElement {
	public static void main(String args[])
	{
		int array[]=new int[]{10,20,30,40,50};
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>40)
				continue;
			sum=sum+array[i];
		}
		System.out.println("Addion is"+sum);
	}

}

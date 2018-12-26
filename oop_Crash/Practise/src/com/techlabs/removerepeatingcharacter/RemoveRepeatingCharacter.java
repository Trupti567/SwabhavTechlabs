package com.techlabs.removerepeatingcharacter;

public class RemoveRepeatingCharacter {
public static void main(String args[])
{
	String input="Trupti";
	
	char array[]=input.toCharArray();
	for(int i=0;i<array.length;i++)
	{
		for(int j=i;j<array.length;j++)
		{
			if(input.charAt(i)==input.charAt(j))
			{
			
			}
		}
		System.out.println(input);
	}
	
}
}

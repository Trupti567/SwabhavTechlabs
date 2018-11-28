package com.techlabs.array;

public class StringArray {
	public static void main(String args[])
	{
		String names[]=new String[]{"Trupti","Nikita","Pratiksha","Vaishu"};
		
		for(String name:names)
		{
			if(name.contains("s"))
			{
				System.out.println(name);
			}
			
		}
	}


}

package com.techlabs.max;

public class TestMaxChar {
	public static void main(String args[])
	{
		
      String input="AaTruptizZ";
	printAscci( input);
	//printAscciiAtoZ();
	//printAscciForCaps();
	
	}
	public static void printAscci(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			char value=input.charAt(i);
			System.out.println("Asccii value of "+value+ " is " +(int)input.charAt(i));
		}
	}
	public static void printAscciiAtoZ()
	{
		for(int i=0;i<255;i++)
		{
			System.out.println("characters of value " +i+ " is "+(char)i);
		}
	}
	public static void printAscciForCaps()
	{
		for(int i='A';i<'Z';i++)
		{
			System.out.println("characters of value " +i+ " is "+(char)i);
		}
	}

}

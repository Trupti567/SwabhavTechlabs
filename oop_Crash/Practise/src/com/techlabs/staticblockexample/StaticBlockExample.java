package com.techlabs.staticblockexample;

public class StaticBlockExample {
	static int number;
	static String name;
	
static{
		number=10;
		name="Trupti";
		System.out.println("Block 1");
	}
static{
	number=20;
	name="Manjusha";
	System.out.println("Block 2");
}
public StaticBlockExample(int number,String name)
{
	this.name=name;
	this.number=number;
	
}
	public static void main(String args[])
	{
		System.out.println("Number is" +number);
		System.out.println("Name is"+name);
		StaticBlockExample example=new  StaticBlockExample(111,"mannu");
		System.out.println(example.name);
		System.out.println(example.number);
		
		
	
	}

}

package com.techlabs.boxingunboxingautoboxing;

public class AutoBoxing {
	public static void main(String args[])
	{
		Integer number=new Integer(20);
		Integer number2=40;
		System.out.println(number+" "+number2);
		Character ch=new Character('A');
		
		Character ch2='B';
		System.out.println(ch+" "+ch2);
		Integer x=50;
		int m=x.compareTo(number);
		System.out.println(m);
		 Integer integer=new Integer(100);
		 System.out.println(integer);
		 
		
		
		
	}
	public static int number(Integer no)
	{
		return no;
	}

}

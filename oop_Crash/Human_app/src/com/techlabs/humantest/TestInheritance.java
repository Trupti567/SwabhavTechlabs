package com.techlabs.humantest;

import com.techlabs.human.Human;

public class TestInheritance {
	public static void main(String args[])
	{
		Human trupti=new Human("Trupti",10 );
		Human trupti1=new Human("Nikita",20);
		Human trupti2=new Human("Trupti",10 );
		Human temp=trupti;
		
		System.out.println(trupti.toString());
		System.out.println(trupti.equals(trupti1));
		System.out.println(trupti.hashCode());
		System.out.println(trupti.equals(trupti));
		System.out.println(trupti.equals(trupti2));
		System.out.println(trupti==trupti2);
		System.out.println(trupti2.hashCode());
		
		
		System.out.println(trupti);
		System.out.println(temp==trupti);
		if(trupti.equals(trupti2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
	}

}

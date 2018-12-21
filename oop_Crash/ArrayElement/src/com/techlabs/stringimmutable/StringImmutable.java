package com.techlabs.stringimmutable;

public class StringImmutable {
	public static void main(String args[])
	{
		String str1="Trupti";
		String str2="Trupti";
		String str3=new String("Manju");
		String str4="manju";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1.equals(str2));
		
		//System.out.println(str3.equals(str4));
		System.out.println(str3.equals(str4));
		
	}

}

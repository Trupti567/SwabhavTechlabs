package com.techlab.setapp2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setapp2 {
	public static void main(String args[])
	{
		Set<Integer> elementset;
		//elementset=new HashSet<Integer>();
		//elementset=new TreeSet<Integer>();
		elementset=new LinkedHashSet<Integer>();
		
		
		elementset.add(11);
		elementset.add(6);
		elementset.add(15);
		elementset.add(65);
		elementset.add(9);
		elementset.add(55);
		System.out.println(elementset);
		
	}

}

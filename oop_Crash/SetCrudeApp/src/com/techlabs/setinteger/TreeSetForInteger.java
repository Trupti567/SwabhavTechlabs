package com.techlabs.setinteger;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetForInteger {
	public static void main(String args[])
	{
		Set<Integer> treeset=new TreeSet<Integer>();
		treeset.add(10);
		treeset.add(5);
		treeset.add(15);
		treeset.add(2);
		treeset.add(17);
		treeset.add(17);
		System.out.println(treeset);
	}

}

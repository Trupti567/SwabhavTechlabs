package com.techlabs.setinteger;

import java.util.HashSet;

public class HashSetForInteger {
	public static void main(String args[]) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(11);
		set.add(12);
		set.add(33);
		set.add(11);
		for (Integer temp : set) {
			System.out.println(temp);
		}
		int no = set.size();
		System.out.println(no);
		System.out.println("Display : " + set);

		set.add(10);
		System.out.println("Adding : " + set);
		
		set.remove(12);
		System.out.println("Deleting : "+set);
		
		
	}

}

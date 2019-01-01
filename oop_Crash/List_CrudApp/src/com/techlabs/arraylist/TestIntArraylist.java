package com.techlabs.arraylist;

import java.awt.List;
import java.util.ArrayList;

public class TestIntArraylist {
	
	public static void main(String args[])
	{
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		System.out.println(array.size());
		System.out.println(" Display : "+array);
		array.add(50);
		System.out.println(" Adding : "+array);
		array.set(4, 500);
		System.out.println("Updating : "+array);
		array.remove(3);
		System.out.println(" Deleting : "+array);
	}
	

}

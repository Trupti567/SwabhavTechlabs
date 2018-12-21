package com.techlabs.humantest;

import com.techlabs.human.GenderOptions;
import com.techlabs.human.Human;

public class ObjectCountTest {
	public static void main(String args[])
	{
		Human human=new Human("Trupti", 5.2f, 40f, 22);
		System.out.println(human.getCount());
		
		Human human2=new Human("Trupti", 22);
		System.out.println(human2.getCount());
		
		Human human3=new Human("nikita", 6.0f, 50.0f, 22, GenderOptions.FEMALE);
		System.out.println(human3.getCount());
	}

}

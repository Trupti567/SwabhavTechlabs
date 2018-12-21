package com.techlabs.test.man;

import com.techlabs.man.Boy;
import com.techlabs.man.Infant;
import com.techlabs.man.Kid;
import com.techlabs.man.Man;

public class TestPolymorphism {
	public static void main(String args[])
	{
		//atThePark(new Man());
		atThePark(new Boy());
		//atThePark(new Kid());
		//atThePark(new Infant()); 
	}
	public static void atThePark(Man x)
	
	{
		System.out.println("At the park");
		x.play();
	}

}

package com.techlabs.testman.boy;

import com.techlabs.man.Boy;
import com.techlabs.man.IEmotional;
import com.techlabs.man.IManuable;
import com.techlabs.man.Man;

public class TestPolymorphism {
	public static void atTheMovies(IEmotional x)
	{
		System.out.println("Emotionable is implementing");
		x.cry();
		x.laugh();
	}
	public static void atTheParty(IManuable y)
	{
		System.out.println("Imanurable is implementing");
	
	y.depart();
	y.wish();

}
	public static void main(String args[])
	{
		Man man=new Man();
		Boy boy=new Boy();
		atTheMovies(boy);
		atTheParty(boy);
		atTheParty(man);
		
	}
}

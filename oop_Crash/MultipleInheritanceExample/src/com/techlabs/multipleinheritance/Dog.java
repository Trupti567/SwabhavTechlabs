package com.techlabs.multipleinheritance;

public class Dog implements Cat,Pet {
	public void eat()
	{
		System.out.println("Animal having various eating habbit");
	}
   public void friend()
   {
	   System.out.println("Pets are good friends of human");
   }
   public static void main(String args[])
   {
	  Dog dog=new Dog();
	  dog.eat();
	  dog.friend();
	  dog.catEatingHabits();
	 
   }
@Override
public void catEatingHabits() {
	System.out.println("cat habits");
}

}

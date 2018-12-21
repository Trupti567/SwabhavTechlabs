package com.techlabs.playertest;

import com.techlabs.player.Player;

public class PlayerTest {
	public static void main(String args[])
	{
		Player player=new Player("Trupti",22);
		printDetails(player);
		Player player2=new Player("Nikita",23);
		printDetails(player2);
		printDetails(player);
		Player player3=new Player("Trupti",22);
		System.out.println(player.equals(player3));
		System.out.println(10.5);
		System.out.println(true);
		System.out.println('#');
		System.out.println(player.getAge());
		
		
		
	}
	
	public static void printDetails(Player p)
	{
		System.out.println("Name : "+p.getName()+" Age :"+p.getAge()+" Id: "+p.getId());
	}

}

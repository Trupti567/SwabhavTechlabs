package com.techlabs.playertest;

import com.techlabs.player.Player;

public class TestOverloaded {
	public static void main(String args[])
	{
		Player player=new Player("Trupti",22);
		Player player1=new Player("Nikita",22);
		Player player2=new Player("Aditya",23);
		System.out.println(player.getHeadCount());
	}
	

}

package com.techlabs.player;

public class Player {
	private String name;
	private int age;
	private static int id = 101;
	private int playerid;
	private static int count = 0;

	public Player(String name, int age) {

		this.name = name;
		this.age = age;
		playerid = id++;
		count++;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return playerid;
	}

	@Override
	public boolean equals(Object secondPlayer) {

		Player other = (Player) secondPlayer;
		if (name.equals(other.name) && age == other.age) {
			return true;
		}
		return false;
	}

	public static int getHeadCount() {

		return count;
	}

}

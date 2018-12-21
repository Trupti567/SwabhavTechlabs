package com.techlabs.human;

import java.util.Objects;

public class Human {
	private String name;
	private float height;
	private float weight;
	private int age;
	private GenderOptions gender;
	private static int count;
	static{
		count=0;
		
	}
	
	

	public Human(String name, float height, float weight, int age,
			GenderOptions gender) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;
		this.count++;
	}

	public Human(String name, float height, float weight, int age) {
		this(name, weight, weight, age, GenderOptions.FEMALE);
	}

	public Human(String name, int age) {
		this(name, 30.5f, 5.2f, age, GenderOptions.FEMALE);
	}

	public String getName() {
		return name;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public GenderOptions gender() {
		return gender;
	}

	public Human whoIsStrong(Human human2) {
		if (this.getHeight() > human2.getHeight()
				&& this.getWeight() > human2.getWeight()) {
			return this;
		}
		return human2;

	}

	@Override
	public String toString() {
		return String.format("{" + "\n" + "Name:" + this.name + "\n" + "Age:"
				+ this.age + "\n" + "OldToString:" + super.toString() + "\n"
				+ "}");
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o == null) {
			return false;

		}
		Human other = (Human) o;
		return Objects.equals(name, other.name)
				&& Objects.equals(age, other.age);
	}

	public int getCount() {
		return count;
	}
	
	public void play()
	{
	 this.weight=this.getWeight()-this.getWeight()*0.02f;
		}

}

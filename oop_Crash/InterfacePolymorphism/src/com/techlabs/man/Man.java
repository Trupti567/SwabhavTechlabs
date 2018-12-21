package com.techlabs.man;

public class Man implements IManuable{

	@Override
	public void wish() {
		System.out.println("Man can wish");
	}

	@Override
	public void depart() {
		System.out.println("Man is departuring");
		
	}

}

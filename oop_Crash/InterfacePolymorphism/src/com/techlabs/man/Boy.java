package com.techlabs.man;

public class Boy implements IEmotional,IManuable{

	@Override
	public void wish() {
		System.out.println("Boy wish to come");
		
	}

	@Override
	public void depart() {
		System.out.println("Boy is Departuring");
		
	}

	@Override
	public void cry() {
		System.out.println("Boy is Crying");
		
	}

	@Override
	public void laugh() {
	System.out.println("Boy is Laughing");
		
	}

}

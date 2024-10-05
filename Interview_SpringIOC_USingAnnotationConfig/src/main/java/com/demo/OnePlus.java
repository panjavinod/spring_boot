package com.demo;

public class OnePlus implements Mobiles {

	Colour colour;
	
	public OnePlus() {
		System.out.println("IM OnePlus CONSTRUCTOR ");
	}
	
	public OnePlus(Colour colour) {
		super();
		this.colour = colour;
	}

	@Override
	public void getModelAndColur() {
		System.out.println("Model  ::  9 ");
		colour.getOnePlusColour();
	}

}

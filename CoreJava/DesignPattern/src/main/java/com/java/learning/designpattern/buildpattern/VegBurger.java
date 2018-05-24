package com.java.learning.designpattern.buildpattern;

public class VegBurger extends Burger {

	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 50.00f;
	}

}

package com.java.learning.designpattern.buildpattern;

public class ChickenBurger extends Burger{

	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 70.00f;
	}

}

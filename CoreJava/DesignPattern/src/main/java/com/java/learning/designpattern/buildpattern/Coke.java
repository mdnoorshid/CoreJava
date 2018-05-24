package com.java.learning.designpattern.buildpattern;

public class Coke extends ColdDrink{

	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 30.00f;
	}

}

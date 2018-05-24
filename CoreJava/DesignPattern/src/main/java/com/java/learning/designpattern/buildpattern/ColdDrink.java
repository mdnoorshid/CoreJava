package com.java.learning.designpattern.buildpattern;

public abstract class ColdDrink implements Item {

	public Packing packing() {
		return new Bottle();
	}
	
	public abstract float price() ;
	
}

package com.java.learning.designpattern.buildpattern;

public abstract class Burger implements Item {
	public Packing packing(){
		return new Wrapper();
	}
	
	public abstract float price() ;
}

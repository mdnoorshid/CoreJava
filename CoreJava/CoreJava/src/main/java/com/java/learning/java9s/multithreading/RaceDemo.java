package com.java.learning.java9s.multithreading;


public class RaceDemo {
	public static void main(String[] args) throws InterruptedException {
		Racer racer = new Racer();
		Thread t1 = new Thread(racer, "tortoise");
		Thread t2 = new Thread(racer, "rabbit");
		t1.start();
		t2.start();
	}
}

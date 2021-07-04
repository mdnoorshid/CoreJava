package com.java.learning.java9s.multithreading;

import org.apache.log4j.BasicConfigurator;

public class RaceDemo {
	public static void main(String[] args) throws InterruptedException {
		BasicConfigurator.configure();
		Racer racer = new Racer();
		Thread t1 = new Thread(racer, "tortoise");
		Thread t2 = new Thread(racer, "rabbit");
		t1.start();
		t2.start();
	}
}

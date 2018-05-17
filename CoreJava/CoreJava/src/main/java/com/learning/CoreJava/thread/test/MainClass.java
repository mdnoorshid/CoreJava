package com.learning.CoreJava.thread.test;

public class MainClass {
public static void main(String[] args) throws InterruptedException {
	EvenThread et = new EvenThread();
	Thread t1 = new Thread(et);
	OddThread ot = new OddThread();
	Thread t2 = new Thread(ot);
	 
	t1.setName("EvenThread");
	t2.setName("OddThread");
	
	t1.start();
	t2.start();
		
		if(t1.isAlive()){
			t2.wait();
			t2.notify();
		}else if(t2.isAlive()){
			t1.wait();
			t1.notify();
		}
	
	
}
}

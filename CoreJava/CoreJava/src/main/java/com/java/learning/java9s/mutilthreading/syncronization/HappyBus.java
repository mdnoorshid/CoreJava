package com.java.learning.java9s.mutilthreading.syncronization;


public class HappyBus {

	public static void main(String[] args) {
		BusReservation br = new BusReservation();
		
		PassengerThread pt1 = new PassengerThread(2,br, "noorshid");
		PassengerThread pt2 = new PassengerThread(2,br,"sam");
		PassengerThread pt3 = new PassengerThread(2,br,"raj");
		PassengerThread pt4 = new PassengerThread(2,br,"cutie");
		PassengerThread pt5 = new PassengerThread(2,br,"salman");
		PassengerThread pt6 = new PassengerThread(2,br,"sk");
		PassengerThread pt7 = new PassengerThread(2,br,"John");
		
		
		pt1.start();
		pt2.start();
		pt3.start();
		pt4.start();
		pt5.start();
		pt6.start();
		pt7.start();
	}
	
}

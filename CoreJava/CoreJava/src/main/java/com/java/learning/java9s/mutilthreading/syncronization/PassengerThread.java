package com.java.learning.java9s.mutilthreading.syncronization;

public class PassengerThread extends Thread {

	private int seatNeeded;
	
	public PassengerThread(int seats , Runnable target , String name){
		super(target,name);
		this.seatNeeded = seats ;
	}
	
	public int getSeatNeeded(){
		return seatNeeded;
	}
	
}

package com.learning.CoreJava.thread.test;

public class EvenThread implements Runnable {

	@Override
	public void run() {
      for(int i=0 ; i<=100 ;i++){
    	  String name = Thread.currentThread().getName();
    	  System.out.println(name+" Thread is running!!");
    	  if(i %2 == 0){
    		System.out.println(i);  
    	  }
    	  try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
	}
	


}

package com.learning.CoreJava.thread;


public class ThreadWithPredifinedMethods {
public static int count;
public static synchronized void incCount(){
	count++;
}
public static void main(String[] args) {
	
	
	Thread t1 = new Thread(new Runnable() {
		public void run() {
			Thread.currentThread().setName("Thread1");
			Thread.currentThread().setPriority(10);
            for(int i = 0 ;i<10000 ; i++){
            	//logger.debug(Thread.currentThread().getName() +" value---->"+i);
            	incCount();
            }
		}
	});
	
	Thread t2 = new Thread(new Runnable() {
		
		public void run() {
          Thread.currentThread().setName("Thread2");
          Thread.currentThread().setPriority(1);
          for(int i = 0 ; i<10000 ;i++){
        	  //logger.debug(Thread.currentThread().getName() +" value---->"+i);
        	  incCount();
          }
		}
	});
	
	//Using lambda(Java 8)
	Thread t3 = new Thread(() -> {
	     for(int i =0 ; i<10 ;i++){
//	    	 logger.debug("i--> "+i);
	     }
	} );
	
	
	
	
	/*t1.start();
	t2.start();*/
	t3.start();
	
	
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}

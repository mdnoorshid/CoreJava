package com.java.learning.java9s.multithreading.yieldthread;

import org.apache.log4j.Logger;

public class YieldRunnable implements Runnable {
  static Logger logger = Logger.getLogger(YieldRunnable.class);
	
	@Override
	public void run() {
       logger.debug("Current Thread: "+Thread.currentThread().getName()+" Priority "+Thread.currentThread().getPriority());
       
      /*Thread.yield();*/
       
       
       
       logger.debug("Current Thread: "+Thread.currentThread().getName()+" Priority "+Thread.currentThread().getPriority()+" End");
	}

}

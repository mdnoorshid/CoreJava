package com.learning.CoreJava.thread;

import org.apache.log4j.Logger;

public class ThreadDemoWithRunnable {
	public static void main(String[] args) {
    //creating first thread
    Thread t1 = new Thread(new ThreadDemo1());
    t1.start();
    //creating second thread
    Thread t2 = new Thread(new ThreadDemo1());
    t2.start();
	}
}

class ThreadDemo1 implements Runnable {
    static Logger logger = Logger.getLogger(ThreadWithPredifinedMethods.class);
	public void run() {
		for (int i = 0; i < 10; i++) {
            logger.debug(Thread.currentThread().getName() +" Value:: "+i);
		}
	}

}
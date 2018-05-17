package com.learning.CoreJava.thread;

import org.apache.log4j.Logger;

public class ThreadDemoWithThread{
public static void main(String[] args) {
	
	//1st thread
	ThreadDemo td1= new ThreadDemo();
	td1.start();
	
	//2nd thread
	ThreadDemo td2 = new ThreadDemo();
	td2.start();
}	
}
 
/**
 * Defining thread class with extending Thread Class and overriding run method
 * @author mdnoo
 *
 */
class ThreadDemo extends Thread{
	static Logger logger = Logger.getLogger(ThreadDemo.class);
@Override
public void run() {
for(int i = 0;i<10; i++){
logger.debug(Thread.currentThread().getName()+" Value:: "+i);	
}
}
}

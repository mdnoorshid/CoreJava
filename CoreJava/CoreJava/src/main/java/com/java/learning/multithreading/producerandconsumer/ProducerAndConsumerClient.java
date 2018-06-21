package com.java.learning.multithreading.producerandconsumer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This is the producer and consumer client class
 * @author mdnoorshid
 */
public class ProducerAndConsumerClient {

	public static void main(String[] args) {
		Queue<Integer> sharedQueue = new LinkedList<>();
		Producer producer = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);
		
		Thread producerThread =  new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		
		producerThread.start();
		consumerThread.start();
	}
	
	
}

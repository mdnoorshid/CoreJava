package com.java.learning.multithreading.producerandconsumer;

import java.util.Queue;
import java.util.Random;

/**
 * Producer thread class
 * 
 * @author mdnoorshid
 *
 */
public class Consumer implements Runnable {

	private Queue<Integer> sharedQueue;


	public Consumer(Queue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (sharedQueue) {
				while (sharedQueue.isEmpty()) { // checking the
															// condition to
															// whether Queue is empty
					System.out.println("Consumer is in WAITING State and waiting for Producer to produce the data...");
					try {
						sharedQueue.wait(); // calling wait method on
											// sharedObject
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				int data = sharedQueue.poll();//Consumer consuming the data
				System.out.println("Consumed:: " + data);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				sharedQueue.notify(); //Once Consumer consumer the data , it notifies to Producer
			}
		}

	}

}

package com.java.learning.multithreading.producerandconsumer;

import java.util.Queue;
import java.util.Random;

/**
 * Producer thread class
 * 
 * @author mdnoorshid
 *
 */
public class Producer implements Runnable {

	private Queue<Integer> sharedQueue;

	private final int MAX_SIZE = 5;

	public Producer(Queue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (sharedQueue) {
				while (sharedQueue.size() == MAX_SIZE) { // checking the
															// condition to
															// whether size is
															// equal to MAX and
															// then calling wait
															// method
					System.out.println("Producer is in WAITING State and waiting for Consumer to consume the data...");
					try {
						sharedQueue.wait(); // calling wait method on
											// sharedObject
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				Random random = new Random();
				int data = random.nextInt(MAX_SIZE);
				sharedQueue.add(data);// Producing data and stored in
									 // sharedQueue
				System.out.println("Produced:: " + data);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				sharedQueue.notify(); //Once Producer produced the data , it notifies to Consumer
			}
		}

	}

}

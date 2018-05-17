package com.learning.datastructure.queue;

import org.apache.log4j.Logger;

public class Queue {
	static Logger logger = Logger.getLogger(Queue.class);
	int[] queue = new int[5];
	int size;
	int front;
	int rear;

	/**
	 * Method to insert data into queue
	 * 
	 * @param data
	 */
	public void enQueue(int data) {
		if (!isFull()) {
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size = size + 1;
		} else {
			logger.error(">>>>QUEUE IS FULL<<<<");
		}
	}

	/**
	 * Method to show the elements in queue
	 */
	public void show() {
		for (int i = 0; i < size; i++) {
			logger.info(queue[(front + i) % 5]);
		}
	}

	/**
	 * Method to delete the element from queue
	 */
	public int deQueue(){
		int data = queue[front];
		if(! isEmpty()){
		front = (front + 1)%5;
		size = size - 1 ;
		}else{
          logger.error(">>>QUEUE IS EMPTY<<<");			
		}
		return data;
	}

	/**
	 * Method to get size of queue
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Method to check queue is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return getSize() == 0;
	}

	/**
	 * Method to check queue is full
	 * 
	 * @return
	 */
	public boolean isFull() {
		return getSize() == 5;
	}

}

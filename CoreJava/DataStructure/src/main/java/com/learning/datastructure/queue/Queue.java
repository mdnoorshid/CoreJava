package com.learning.datastructure.queue;


/*Queue is also an abstract data type or a linear data structure, just like stack data structure, in which the first element is inserted 
from one end called the REAR(also called tail), and the removal of existing element takes place from the other end called as FRONT(also called head).
This makes queue as FIFO(First in First Out) data structure, which means that element inserted first will be removed first.
Which is exactly how queue system works in real world. If you go to a ticket counter to buy movie tickets, and are first in the queue, 
then you will be the first one to get the tickets. Right? Same is the case with Queue data structure. 
Data inserted first, will leave the queue first.
The process to add an element into queue is called Enqueue and the process of removal of an element from queue is called Dequeue.

**Basic features of Queue
1.Like stack, queue is also an ordered list of elements of similar data types.
2.Queue is a FIFO( First in First Out ) structure.
3.Once a new element is inserted into the Queue, all the elements inserted before the new element in the queue must be removed, to remove the new element.
4.peek( ) function is oftenly used to return the value of first element without dequeuing it.
*
*/

public class Queue {
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
			//logger.error(">>>>QUEUE IS FULL<<<<");
		}
	}

	/**
	 * Method to show the elements in queue
	 */
	public void show() {
		for (int i = 0; i < size; i++) {
			//logger.info(queue[(front + i) % 5]);
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
          //logger.error(">>>QUEUE IS EMPTY<<<");
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

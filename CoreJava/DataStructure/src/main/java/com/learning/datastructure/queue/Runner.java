package com.learning.datastructure.queue;


public class Runner {
public static void main(String[] args) {
	Queue queue = new Queue();
	queue.enQueue(1);
	queue.enQueue(2);
	queue.enQueue(3);
	queue.enQueue(4);
	/*queue.deQueue();
	queue.deQueue();*/
	queue.enQueue(5);
	queue.enQueue(6);

	queue.enQueue(7);
	queue.enQueue(15);
   
	System.out.println("Is empty---> "+queue.isEmpty());
	
	System.out.println("Size--> "+queue.getSize());
	 System.out.println("Is full---> "+queue.isFull());
    
	
	queue.show();
}
}

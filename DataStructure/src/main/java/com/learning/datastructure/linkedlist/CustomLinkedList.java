package com.learning.datastructure.linkedlist;

import org.apache.log4j.Logger;

/**
 * Custom LinkedList Class
 * 
 * @author Md Noorshid
 */
public class CustomLinkedList {

	static Logger logger = Logger.getLogger(CustomLinkedList.class);

	Node head;

	/**
	 * Method to insert the element at last index
	 * 
	 * @param data : Data to be insert
	 */
	public void insert(int data) {
		Node node = new Node(); // Defining Object Of Node Class
		node.data = data; // initializing the data from the end user to node
							// object
		node.next = null; // Setting the next to null,since last node hold null
							// value

		// Checking the condition if there is not present data already,might be
		// the first node
		if (head == null) {
			head = node;
		} else {
			Node n = head; // starting from head itself
			while (n.next != null) { // traversing the next element which is not
										// null
				n = n.next;
			}
			n.next = node;

		}
	}// end of method

	/**
	 * Method to insert at start OR  at index=0
	 * @param data : Data to be insert
	 */
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}// end of method

	/**
	 * Method to insert data at any point or index
	 * @param index : position of index
	 * @param data : data need to be insert
	 */
	public void insertAtAnyPoint(int index, int data) {
		Node node = new Node(); // defining random node
		node.data = data; // putting data on it
		node.next = null;
		Node n = head; // initial node
		if(index == 0){
			insertAtStart(data);
		}else{
		for (int i = 0; i < index-1; i++) {
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
		}
	}//end of method
    
	/**
	 * method to delete the node
	 * @param index : position need (OR) index need to delete
	 */
	public void deleteNode(int index) {
		Node n = head;
		if(index == 0){
			head = head.next;
		}else{
			for(int i=0 ;i<index-1 ;i++){
				n = n.next;
			}
			Node n1 = n.next;
			n.next = n1.next;
		}
	}//end of method
  
	/**
	 * Method to check show data
	 */
	public void show() {

		Node n = head;
		while (n.next != null) {
			logger.info(n.data);
			n = n.next;
		}
		logger.info(n.data);

	}//end of method

}

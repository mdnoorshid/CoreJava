package com.learning.datastructure.linkedlist;

/**
 * This is the Node Class which is the Node OR Element contains the data and
 * address of next Node
 * 
 * @author mdnoo
 *
 */
public class Node {
	public int data;
	public Node next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}

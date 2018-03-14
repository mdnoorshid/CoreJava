package com.learning.datastructure.linkedlist;

import org.apache.log4j.BasicConfigurator;

/**
 * Main Class to demonstrate CustomLinkedList Class
 * @author Md Noorshid
 *
 */
public class Runner {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.insert(1);
        customLinkedList.insert(2);
        customLinkedList.insert(3);
        customLinkedList.insert(4);
        customLinkedList.insert(5);
       // customLinkedList.insertAtStart(23);
        customLinkedList.insertAtAnyPoint(1,7);
       customLinkedList.deleteNode(5);
        customLinkedList.show();
	}

}

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
        customLinkedList.insertAtLast(1);
        customLinkedList.insertAtLast(2);
        customLinkedList.insertAtLast(3);
        customLinkedList.insertAtLast(4);
        customLinkedList.insertAtLast(5);
        customLinkedList.insertAtLast(6);
       // customLinkedList.insertAtStart(23);
        customLinkedList.insertAtAnyPoint(1,7);
     //  customLinkedList.deleteNode(5);
        customLinkedList.show();
        customLinkedList.getMiddle();
	}

}

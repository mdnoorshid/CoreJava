package com.learning.datastructure.stack;

import org.apache.log4j.Logger;

public class Stack {
	static Logger logger = Logger.getLogger(Stack.class);
	int stack[] = new int[6];
	int top;

	/**
	 * Method to insert element into stack
	 */
	public void push(int data) {
		if (top == stack.length) {
			logger.error("====STACK IS FULL====");
		} else {
			stack[top] = data;
			top++;
		}
	}

	/**
	 * Method to show all the values in the stack
	 */
	public void show() {
		for (int n : stack) {
			logger.info(n);
		}
	}

	/**
	 * Method to delete the value from stack
	 */
	public int pop() {
		int data = 0;
		if (isEmpty()) {
			logger.error("====STACK IS EMPTY====");
		} else {
			top--;
			data = stack[top];
			stack[top] = 0;
		}
		return data;
	}

	/**
	 * The peek() method is used to look at the object at the top of this stack
	 * without removing it from the stack.
	 * 
	 * @return
	 */
	public int peek() {
		int data;
		data = stack[top - 1];
		return data;
	}

	/**
	 * Method to find the size of the stack
	 * 
	 * @return
	 */
	public int size() {
		return top;
	}

	/**
	 * Method to check whether the stack holds empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return top <= 0;
	}

}

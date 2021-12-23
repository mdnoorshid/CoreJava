package com.learning.datastructure.stack;


public class DynamicStack {
	int capacity = 2;
	int stack[] = new int[capacity];
	int top;

	/**
	 * Method to insert element into stack
	 */
	public void push(int data) {
		if (size() == capacity) {
			expand();
		}
		stack[top] = data;
		top++;
	}

	private void expand() {
		int length = size();
		int[] newStack = new int[capacity * 2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity *= 2;
	}

	/**
	 * Method to show all the values in the stack
	 */
	public void show() {
		for (int n : stack) {
			//logger.info(n);
		}
	}

	/**
	 * Method to delete the value from stack
	 */
	public int pop() {
		int data = 0;
		if (isEmpty()) {
			//logger.error("====STACK IS EMPTY====");
		} else {
			top--;
			data = stack[top];
			stack[top] = 0;
			shrink();
		}
		return data;
	}

	private void shrink() {
      int length = size();
      if(length <= (capacity/2)/2){
    	  capacity = capacity/2;
    	  
    	  int newStack[] = new int[capacity];
    	  System.arraycopy(stack, 0, newStack, 0, length);
    	  stack = newStack;
      }
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
	
	public int stackCapacity(){
		return stack.length;
	}

}

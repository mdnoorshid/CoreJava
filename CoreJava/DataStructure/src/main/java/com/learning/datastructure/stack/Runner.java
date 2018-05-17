package com.learning.datastructure.stack;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Runner {
	static Logger logger = Logger.getLogger(Runner.class);
public static void main(String[] args) {
	BasicConfigurator.configure();
	//Stack stack = new Stack();
	DynamicStack stack = new DynamicStack();
	stack.push(10);
	stack.push(11);
	
	logger.debug("Stack current capacity----> "+stack.stackCapacity());
	stack.push(10);
	stack.push(11);
	stack.push(10);
	logger.debug("Stack current capacity----> "+stack.stackCapacity());
	stack.push(11);
	stack.push(10);
	stack.push(11);
	stack.push(10);
	stack.push(11);
	logger.debug("Stack current capacity----> "+stack.stackCapacity());
	stack.pop();
	stack.pop();
	stack.pop();
	stack.pop();
	stack.pop();
	stack.pop();
	logger.debug("Stack current capacity----> "+stack.stackCapacity());
//	logger.debug("Value peeked ----> "+stack.peek());
	/*stack.push(10);
	stack.push(10);*/
/*	stack.push(10);
	stack.push(10);
	stack.push(10);
	stack.push(10);
	stack.push(10);
	stack.push(10);*/
	/*logger.debug("Value deleted ----> "+stack.pop());
	logger.debug("Value deleted ----> "+stack.pop());
	logger.debug("Value deleted ----> "+stack.pop());
	logger.debug("Value deleted ----> "+stack.pop());
	logger.debug("Value deleted ----> "+stack.pop());
	logger.debug("Value deleted ----> "+stack.pop());*/
    	
	stack.show();
	
	logger.debug("size of stack: "+stack.size()); 
//	logger.debug("Is Empty:: "+stack.isEmpty()); 
}
}

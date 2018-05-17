package com.java.learning.designpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javax.management.RuntimeErrorException;

/**
 * In singleton design pattern a class
 * should create only one instance.
 * Whatever instance it should create it should have
 * same hashcode and all refernces should point to the same object.
 * @author mdnoorshid
 *
 */
public class SingletonDesignPattern {
private static int count = 0;
private static SingletonDesignPattern singletonDesignPattern = null;
private SingletonDesignPattern(){
	if(singletonDesignPattern != null){
		throw new RuntimeException();
	}
	System.out.println("Creating instance of SingletonDesignPattern");
	count++;
}

static SingletonDesignPattern getInstance(){
	if(count == 0){
		singletonDesignPattern = new SingletonDesignPattern();
		return singletonDesignPattern;
	}else{
		return singletonDesignPattern;
	}
}

public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	SingletonDesignPattern s1 = SingletonDesignPattern.getInstance();
	SingletonDesignPattern s2 = SingletonDesignPattern.getInstance();
	System.out.println("s1:: "+s1.hashCode());
	System.out.println("s2:: "+s2.hashCode());
	
	//Reflection
	Class clazz = Class.forName("com.java.learning.designpattern.SingletonDesignPattern");
	Constructor<SingletonDesignPattern> cons = clazz.getDeclaredConstructor();
	cons.setAccessible(true);
	SingletonDesignPattern s3 = cons.newInstance();
	System.out.println("s3:: "+s3.hashCode());
	
	
	
}

}

package com.java.learning.designpattern.singleton;

import java.lang.reflect.Constructor;

public class SingletonClient {
public static void main(String[] args) {
	Singleton singleton = Singleton.getInstance();
	System.out.println(singleton);
	Singleton singleton2 = Singleton.getInstance();
	System.out.println(singleton2);
	
	
}
}

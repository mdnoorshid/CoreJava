package com.java.learning.java8;

import java.util.function.BiConsumer;

/*Represents an operation that accepts two input arguments and returns no
 result.*/
public class BiConsumerTest {
 
	public static void wishBirthday(String name, Integer age){
		System.out.println("Happy birthday: "+name+" , u have turned into"+age);
	}
	
	public static void main(String[] args) {
		
		//Using anonymous class
		/* BiConsumer<String,Integer> biconTest3 = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String t, Integer u) {
				 System.out.println("Happy birthday: "+t+" , u have turned into "+u);			
			}
		};
		
		biconTest3.accept("Md Noorshid",26);*/
		
		//Using lambda
		BiConsumer<String,Integer> biconTest2 = (n,a) -> System.out.println("Happy birthday: "+n+" , u have turned into "+a);
		
		biconTest2.accept("Md Noorshid", 26);
		
		//Using Method Reference
           BiConsumer<String,Integer> biconTest1 = BiConsumerTest::wishBirthday;
           biconTest1.accept("Md Noorshid",26);
	}
}

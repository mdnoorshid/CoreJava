package com.java.learning.java8;

import java.util.function.Function;

/*Represents a function that accepts one argument and produces a result.
 * @param <T> the type of the input to the function
 * @param <R> the type of the result of the function
 * 
 * */

public class FunctionTest {
public static String sayHello(String name){
	return "Hello from method reference "+name;
}

public static void main(String[] args) {
	
	//using anonymous inner type
	Function<String, String> functionTest1 = new Function<String, String>() {

		@Override
		public String apply(String t) {
			return "Hello from anonymous inner type "+t;
		}
	};
	System.out.println(functionTest1.apply("Md Noorshid"));
	
	//Using lambda
	Function<String,String> functionTest2 = message -> "Hello from lambda "+message;
	System.out.println(functionTest2.apply("Md Noorshid"));
	
	//Using method reference
	Function<String, String> functionTest3 = FunctionTest::sayHello;
	System.out.println(functionTest3.apply("Md Noorshid"));
	
	
	
	
	
	
}

}

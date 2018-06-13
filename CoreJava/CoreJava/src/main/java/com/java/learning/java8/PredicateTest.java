package com.java.learning.java8;

import java.util.function.Predicate;
/*Represents a predicate (boolean-valued function) of one argument.*/
public class PredicateTest {
	
	public static boolean isValid(Integer age) {
		if (age > 18)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		//Using anonymous class
	   Predicate<Integer> predicateTest = new Predicate<Integer>() {

		@Override
		public boolean test(Integer t) {
			if (t > 18)
				return true;
			else
				return false;
		}
	};
	System.out.println(predicateTest.test(45));
		
		//Using lambda expression
		
		Predicate<Integer> predicateTest2 = (age) -> {
			if (age > 18)
				return true;
			else
				return false;
		};
		System.out.println(predicateTest2.test(15));
		
		//Using method reference
		Predicate<Integer> predicateTest3 = PredicateTest::isValid;
		System.out.println(predicateTest3.test(77));
	
	
	
	
	
	
	
	
	
	}
}

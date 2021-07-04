package com.learning.practice;

public class Test {
	public static void main(String[] args) {
		
		System.out.println(extractSpringExpressionValue(null));
	}
	
	 private static String extractSpringExpressionValue(String springExpressionVal){

		  String envKey = springExpressionVal.replaceAll("[^0-9a-zA-Z:,.]+", "");
	        if(envKey.contains(":")){
	            return envKey.split(":")[0];
	        }
	        return envKey;
	    }
	
	
}

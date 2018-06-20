package com.java.learning.miscellaneoussolutions;

import java.time.format.ResolverStyle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Miscellaneous {

	/**
	 * Method to find the largest number in an Array
	 * 
	 * @param targetArray
	 * @return
	 */
	public int largestNumInArray(int[] targetArray) {
		// Method 1
		/*
		 * int temp; int lengthOfArray= targetArray.length; for(int
		 * i=0;i<lengthOfArray;i++){ for(int j=i+1;j<lengthOfArray;j++){
		 * if(targetArray[i] > targetArray[j]){ temp = targetArray[i];
		 * targetArray[i] = targetArray[j]; targetArray[j]=temp; } }
		 * 
		 * } return targetArray[lengthOfArray-1];
		 */

		// Method 2

		int temp = targetArray[0];
		for (int i = 0; i < targetArray.length; i++) {
			if (temp < targetArray[i]) {// To get lowest just change the
										// condition
				temp = targetArray[i];
			}
		}
		return temp;

	}

	/**
	 * Method to print fibonacci series
	 * 
	 * @param countVal
	 */
	public void printFibonacciSeries(int countVal) {
		int count = countVal, n1 = 0, n2 = 1, n3;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

	/**
	 * Method to print fibonacci series using recursive method
	 * 
	 * @return
	 */
	public void printFibonacciSeriesRecursive(int count) {
		int n1 = 0, n2 = 0, n3 = 0;
		System.out.println(n1 + " " + n2);
		for (int i = 0; i < count; i++) {
			n3 = n1 + n2;
			System.out.println(" " + n3);
			n1 = n2;
			n2 = n3;
			printFibonacciSeries(count - 1);
		}
	}

	public boolean isPalindromeNumber(int num) {
		return getReverseNum(num) == num ? true : false;
	}

	/**
	 * Method to reverse the number
	 * 
	 * @param num
	 * @return
	 */
	public int getReverseNum(int num) {
		int reverse = 0;
		while (num > 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		return reverse;
	}

	/**
	 * Method to get reverse of number using recursive method
	 * 
	 * @param num
	 * @return
	 */
	public int getReverseNumUsingRecursive(int num) {
		int reverse = 0;
		while (num > 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
			getReverseNumUsingRecursive(num - 1);
		}
		return reverse;
	}

	/**
	 * Method to find factorial by using iteration
	 * 
	 * @return
	 */
	public void findFactorialIteration(int num) {
		int result = 1;
		while (num != 0) {
			result = result * num;
			num--;
		}
		System.out.println(result);
	}

	/**
	 * Method to find the factorial using recursion method
	 * 
	 * @param num
	 */
	public int findFactorialUsingRecursion(int num) {
		int result = 1;
		if (num == 0) {
			return 1;
		} else {
			result = findFactorialUsingRecursion(num - 1) * num;
		}
		return result;
	}

	/**
	 * Method to reverse the String
	 * 
	 * @param args
	 */
	public String reverseString(String str) {
		char[] charArr = str.toCharArray();
		char[] revCharArr = new char[charArr.length];
		int j = 0;
		for (int i = charArr.length - 1; i >= 0; i--) {
			revCharArr[j] = charArr[i];
			j++;
		}
		String revStr = new String(revCharArr);
		return revStr;
	}

	/**
	 * Method to find the occurance of character in a String
	 */
	public int occuranceOfCharacter(char c, String targetString) {
		char[] targetCharArr = targetString.toCharArray();
		Map<Character, Integer> hashMap = new HashMap<>();

		for (char ch : targetCharArr) {
			if (hashMap.containsKey(ch)) {
				hashMap.put(ch, hashMap.get(ch) + 1);
			} else {
				hashMap.put(ch, 1);
			}
		}

		/*
		 * Set<Entry<Character, Integer>> entrySet = hashMap.entrySet();
		 * for(Entry<Character,Integer> entry:entrySet){ entry.get }
		 */
		Integer occurance = 0;
		if (hashMap.containsKey(c)) {
			occurance = hashMap.get(c);
		}
		return occurance;
	}

	/**
	 * Method to get the occurance of word in a string
	 * 
	 * @param targetWord
	 * @param targetString
	 */
	public void occuranceofWord(String targetWord, String targetString) {
		String[] targetStringArr = targetString.split("\\s");
		int count = 0;
        for(int i = 0 ; i < targetStringArr.length ; i++){
        	if(targetStringArr[i].equals(targetWord)){
        		count++;
        	}
        }
		
		System.out.print(targetWord+" occured "+count+" times.");
	}

	/**
	 * Method to get duplicates of characters in a String
	 * 
	 * @param targetString
	 */
	public void getDuplicatesOfCharacters(String targetString) {
		char[] targetCharArr = targetString.toCharArray();
		Map<Character, Integer> hashMap = new HashMap<>();
		for (Character ch : targetCharArr) {
			if (hashMap.containsKey(ch)) {
				hashMap.put(ch, hashMap.get(ch) + 1);
			} else {
				hashMap.put(ch, 1);
			}
		}

		Object obj = new Object();

		Set<Entry<Character, Integer>> entrySet = hashMap.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " is duplicate and occurs " + entry.getValue());
			}
		}

	}

	/**
	 * Method to get duplicate of words
	 * 
	 * @param paragraph
	 */
	public void getDuplicatesOfWord(String paragraph) {
		String[] targetStringArr = paragraph.split(" ");
		Map<String, Integer> hashMap = new HashMap<>();
		for (String str : targetStringArr) {
			if (hashMap.containsKey(str)) {
				hashMap.put(str, hashMap.get(str) + 1);
			} else {
				hashMap.put(str, 1);
			}
		}

		System.out.println("Duplicate of words map:: " + hashMap);

		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " is duplicate and occurs " + entry.getValue());
			}
		}
	}

	/**
	 * Method to check the number is armstrong
	 * 153 = 1^3 + 5^3 + 3 ^3
	 * @param num
	 * @return
	 */
	public boolean isArmstrongNumber(int num) {
		int last = 0;
		int totalCalc=0;
		boolean isArmstrong= false;
		int temp = num;
		while(num > 0){
		  last = num % 10;
		  last = last*last*last;
		  System.out.println("last:: "+last);
		  num = num/10;
		  System.out.println("num:: "+num);
		  totalCalc+= last;
		  System.out.println("totalCalc:: "+totalCalc);
		}
		
		if(totalCalc == temp){
			isArmstrong = true;
		}
		return isArmstrong;
	}
	
	/**
	 * Method to find the longest increasing subsequence array
	 * @param array
	 * @return
	 */
	public int[] longestIncreasingSubsequenceArray(int[] array){
		int count = 0;
        for(int i = 0 ; i<array.length ; i++){
        	if((array[i] < array[i+1]) && i!= array.length-1){
        		count ++ ;
        	}
        }
		System.out.println(count);
		
		
		
		return array;
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		Miscellaneous miscellaneous = new Miscellaneous();
		/*
		 * int largestNumInArray = miscellaneous.largestNumInArray(new
		 * int[]{1,2,5,6,3,2}); System.out.println(largestNumInArray);
		 * miscellaneous.printFibonacciSeries(15); System.out.println(
		 * "========================================================================"
		 * ); int count =10; miscellaneous.printFibonacciSeries(count);
		 */ /*
			 * int reverseNum = miscellaneous.getReverseNum(425);
			 * System.out.println("reverseNum===> "+reverseNum); boolean
			 * palindromeNumber = miscellaneous.isPalindromeNumber(122);
			 * System.out.println(palindromeNumber);
			 */
		/*
		 * int reverseNumUsingRecursive =
		 * miscellaneous.getReverseNumUsingRecursive(657);
		 * System.out.println(reverseNumUsingRecursive);
		 */
		// miscellaneous.findFactorialIteration(5);
		/*
		 * int findFactorialUsingRecursion =
		 * miscellaneous.findFactorialUsingRecursion(5);
		 * System.out.println(findFactorialUsingRecursion);
		 */
		/*
		 * String str = "noorshid"; String upperCase = str.toUpperCase();
		 * System.out.println("str " + upperCase); System.out.println();
		 * System.out.println(miscellaneous.reverseString("Noorshid")); int
		 * occuranceOfCharacter = miscellaneous.occuranceOfCharacter('m',
		 * "programmer"); System.out.println("occurance of character:: " +
		 * occuranceOfCharacter);
		 * miscellaneous.getDuplicatesOfCharacters("programmer"); miscellaneous.
		 * getDuplicatesOfWord("java is my life , and i love java , do you love java"
		 * );
		 */
		/*boolean armstrongNumber = miscellaneous.isArmstrongNumber(371);
         System.out.println(armstrongNumber);*/
		
		//miscellaneous.longestIncreasingSubsequenceArray(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
		miscellaneous.occuranceofWord("java","my life is ");
		
		
	}

}

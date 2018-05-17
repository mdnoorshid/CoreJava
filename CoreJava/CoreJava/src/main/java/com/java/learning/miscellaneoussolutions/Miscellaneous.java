package com.java.learning.miscellaneoussolutions;

import java.util.Collections;

public class Miscellaneous {

	/**
	 * Method to find the largest number in an Array
	 * @param targetArray
	 * @return
	 */
	public int largestNumInArray(int[] targetArray){
		//Method 1
		/*int temp;
		int lengthOfArray= targetArray.length;
		for(int i=0;i<lengthOfArray;i++){
			for(int j=i+1;j<lengthOfArray;j++){
				if(targetArray[i] > targetArray[j]){
					temp = targetArray[i];
					targetArray[i] =  targetArray[j];
					targetArray[j]=temp;
				}
			}
			
		}
		return targetArray[lengthOfArray-1];*/
		
		//Method 2
		
		int temp = targetArray[0];
		for(int i=0;i<targetArray.length;i++){
			if(temp < targetArray[i]){//To get lowest just change the condition
				temp = targetArray[i];
			}
		}
		return temp;
		
		
	}

	/**
	 * Method to print fibonacci series
	 * @param countVal
	 */
	public void printFibonacciSeries(int countVal){
		int count = countVal,n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i = 2 ;i<count ;i++){
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
		
	}
	
	/**
	 * Method to print fibonacci series using recursive method
	 * @return
	 */
	public void printFibonacciSeriesRecursive(int count){
		int n1=0,n2=0,n3=0;
     System.out.println(n1+" "+n2);
     for(int i = 0;i<count; i++){
    	 n3 = n1+n2;
       System.out.println(" "+n3);
         n1 = n2;
         n2 = n3;
         printFibonacciSeries(count-1);
       }
	}
	

	public boolean isPalindromeNumber(int num){
	return getReverseNum(num) == num ? true : false;	
	}
	
	/**
	 * Method to reverse the number
	 * @param num
	 * @return
	 */
	public int getReverseNum(int num){
		int reverse = 0;
		while(num>0){
			reverse = reverse * 10 + num % 10;
			num = num/10;
		}
		return reverse;
	}
	
	/**
	 * Method to get reverse of number using recursive method
	 * @param num
	 * @return
	 */
	public int getReverseNumUsingRecursive(int num){
		int reverse = 0;
		while(num > 0){
			reverse = reverse * 10+num % 10;
			num = num /10;
			getReverseNumUsingRecursive(num-1);
		}
		return reverse;
	}
	
	/**
	 * Method to find factorial by using iteration
	 * @return
	 */
	public void findFactorialIteration(int num  ){
		int result = 1;
		while(num != 0){
			result = result*num;
			num--;
		}
		System.out.println(result);
	}
	
	/**
	 * Method to find the factorial using recursion method
	 * @param num
	 */
	public int findFactorialUsingRecursion(int num){
		int result = 1;
		if(num == 0){
			return 1;
		}else{
			result = findFactorialUsingRecursion(num-1)*num;
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
	Miscellaneous miscellaneous = new Miscellaneous();
    /*int largestNumInArray = miscellaneous.largestNumInArray(new int[]{1,2,5,6,3,2});
    System.out.println(largestNumInArray);
    miscellaneous.printFibonacciSeries(15);
    System.out.println("========================================================================");
    int count =10;
    miscellaneous.printFibonacciSeries(count);
*/   /* int reverseNum = miscellaneous.getReverseNum(425);
    System.out.println("reverseNum===> "+reverseNum);
   boolean palindromeNumber = miscellaneous.isPalindromeNumber(122);
    System.out.println(palindromeNumber);*/
	/*int reverseNumUsingRecursive = miscellaneous.getReverseNumUsingRecursive(657);
	System.out.println(reverseNumUsingRecursive);*/
	//miscellaneous.findFactorialIteration(5);
	/*int findFactorialUsingRecursion = miscellaneous.findFactorialUsingRecursion(5);
	System.out.println(findFactorialUsingRecursion);*/
	 String str ="noorshid";
	 String upperCase = str.toUpperCase();
	 System.out.println("str "+upperCase);
	 
	
	}
	
}

package com.java.interview.deloitte;

import java.util.Arrays;

public class DeloitteCommonQuestions {

	/**
	 * Method to check two strings is anagram or not Two Strings are called
	 * anagram if they contain same set of characters but in different order
	 * Ex: keep - peek
	 */
	public boolean isAnagram(String s1, String s2) {
		boolean statusFlag = true;
        
		//First remove spaces
		String str1 = s1.replace("\\s","");
		String str2 = s2.replace("\\s","");
		//Second compare the length
		if(str1.length() != str2.length()){
			statusFlag = false;
			return statusFlag;
		}else{
		//if lenght is equal , then convert both strings into character array	
         char[] arrayS1= str1.toLowerCase().toCharArray();
         char[] arrayS2= str2.toLowerCase().toCharArray();
         //Then sort both character array
         Arrays.sort(arrayS1);
         Arrays.sort(arrayS2);
         //Then equals method find that they contain the same elements in same number 
          statusFlag = Arrays.equals(arrayS1, arrayS2);
		}
		return statusFlag;
	}
	
	/**
	 * Method to check palindrome of two strings
	 * @param s1
	 * @param s2
	 * @return
	 */
	public boolean isPalindrome(String s1){
		boolean statusFlag = false;
		String rev="";
		String str = s1.replace("\\s","");
		int strLength= str.length();
		for(int i = strLength-1 ; i>=0 ; i--){
			rev = rev+str.charAt(i);
			System.out.println(rev);
		}
	
		if(str.equalsIgnoreCase(rev)){
			statusFlag=true;
		}
		return statusFlag;
	}

}

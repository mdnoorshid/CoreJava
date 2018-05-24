package com.java.interview.deloitte;
/**
 * Deloitte Installer class
 * @author mdnoorshid
 *
 */
public class DeloitteInstaller {
	
public static void main(String[] args) {
	DeloitteCommonQuestions deloitteCommonQuestions = new DeloitteCommonQuestions();
	boolean anagram = deloitteCommonQuestions.isAnagram("MotherInLaw","HitlerWoman");
	System.out.println(anagram);
	boolean palindrome = deloitteCommonQuestions.isPalindrome("malayalam");
	System.out.println("Palindrome:: "+palindrome);
	
}
}

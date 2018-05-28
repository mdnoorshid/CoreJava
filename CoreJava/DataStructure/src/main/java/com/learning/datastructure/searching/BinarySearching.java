package com.learning.datastructure.searching;

import java.util.List;

/*It is a searching algorithm applied on Sorted Array only. It is also known as half-interval search, 
 *logarithmic search or binary chop. This algorithm searches the required element in the repeatedly
 *process of dividing the array in half and searches the element. 
 *Array is divided into two half by finding the middle element using formula:
  Mid= low + (high-low)/2*/

/* Worst case Performance  O(logn)
 * Best case Performance O(1)
 * Average case Performance O(9)
 * Worst Case Space Complexity O(1)
 * 
 * */ 

public class BinarySearching {

	
	public String doBinarySearch(int[] arr,int keynum){
		//need to implement sorting algorithm here
	   int n = arr.length;
	   int start = 0;
	   int end = n-1 ;
	   int mid = 0;

	   
	   while(start <= end){
		   mid =(start+end)/2;
		   if(arr[mid] == keynum){
			   return "Elements found at  index "+mid;
		   }else if(keynum < arr[mid]){
			   end = mid-1;
		   }else if(keynum > arr[mid]){
			   start = mid+1;
		   }
	   }
	return "Element doesnot exist";
	}
	
	
	
	public static void main(String[] args) {
		BinarySearching binarySearching = new BinarySearching();
		String doBinarySearch = binarySearching.doBinarySearch(new int[]{1, 2,4,6,7,8,9},8);
		System.out.println(doBinarySearch);

	
	}
	
}


package com.learning.datastructure.searching;

import java.util.List;

/*It is a searching algorithm applied on Sorted Array only. It is also known as half-interval search, 
 *logarithmic search or binary chop. This algorithm searches the required element in the repeatedly
 *process of dividing the array in half and searches the element. 
 *Array is divided into two half by finding the middle element using formula:
  Mid= low + (high-low)/2*/

/* Worst case Performance  O(logn)
 * Best case Peerformance O(1)
 * Average case Performance O(logn)
 * Worst Case Space Complexity O(1)
 * 
 * */ 

public class BinarySearching {

	
	public boolean doBinarySearch(int[] arr,int keynum){
	   int num = arr.length;
	    int low, mid, high;  
	    boolean found = false;
	  
	    
	    bubbleSort(arr);
	    System.out.println("--------Sorted Array-----");
	    
	    for(int k = 0 ; k < arr.length ; k++){
	    	System.out.print(arr[k]+" ");
	    }
	  //  System.out.println();
	    /*  Binary searching begins */  
	    low = 1;
	    high = num;
	    
	    do{
	    	mid = (low+high)/2;
	    }while(keynum != arr[mid] && low <=high);{
	    	if(keynum == arr[mid]){
	    		System.out.println("Search Successfully!!");
	    		found = true;
	    	}else{
	    		System.out.println("Search failed!!");
	    	}
	    }
		return found;
	}
	
	public int[] bubbleSort(int[]arr){
		  /*  Bubble sorting begins */  
		int temp,i,j;
		int num = arr.length;
	    for( i = 0; i<num; i++){
	      for( j = 0 ; j <num ; j++){
	    	  
	    	  if(arr[j] > arr[j+1]){
	    		  temp = arr[j];
	    		  arr[j] = arr[j + 1];
	    		  arr[j+1] = temp;
	    	  }
	    	  
	      }
	    }
		return arr;
		
	}
	
	public static void main(String[] args) {
		BinarySearching binarySearching = new BinarySearching();
		boolean doBinarySearchResult = binarySearching.doBinarySearch(new int[]{1,2,5,6,7,3,4},1);
		System.out.println(doBinarySearchResult);
	}
	
}


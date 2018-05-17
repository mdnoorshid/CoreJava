package com.learning.datastructure.sorting;
/**
 * Main class
 * @author Md Noorshid
 *
 */
public class Runner {

public static void main(String[] args) {
	InsertionSorting insertionSorting = new InsertionSorting();
	 int[] testArr = new int[]{1,4,2,5,9,8,7};
     int[] insertionSort = insertionSorting.insertionSort(testArr);
     for(int i =0 ;i<insertionSort.length;i++){
    	 System.out.print(insertionSort[i]+" ");
     }
}
	
}

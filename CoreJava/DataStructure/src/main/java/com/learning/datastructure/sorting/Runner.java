package com.learning.datastructure.sorting;
/**
 * Main class
 * @author Md Noorshid
 *
 */
public class Runner {

public static void main(String[] args) {
	Sorting sorting = new Sorting();
	 int[] testArr = new int[]{1,4,2,5,9,8,7};
    /* int[] insertionSort = sorting.insertionSort(testArr);
     for(int i =0 ;i<insertionSort.length;i++){
    	 System.out.print(insertionSort[i]+" ");
     }*/

   /*  int[] selectionSortingArr = sorting.selectionSorting(testArr);
    
     for(int i = 0 ; i< selectionSortingArr.length ; i++){
    	 System.out.print(selectionSortingArr[i]+" ");
     }*/
	 
	 /*int[] bubbleSorting = sorting.bubbleSorting(testArr);
	 for(int i = 0 ; i< bubbleSorting.length ; i++){
    	 System.out.print(bubbleSorting[i]+" ");
     }*/
	 
      int[] insertionSorting = sorting.insertionSorting(testArr);
      for(int i = 0 ; i< insertionSorting.length ; i++){
     	 System.out.print(insertionSorting[i]+" ");
      
	 
     
     
}
}	
}

package com.learning.datastructure.sorting;
/**
 *InsetionSorting class
 *Its not a faster way of sorting since it needs needs
 *nested to loops to shift items into place.
 *It is only useful for small data sets. 
 * @author Md Noorshid
 */
public class InsertionSorting {

/**
 * Method to do insertion sorting	
 * @param list : Target List
 * @return
 */
public int[] insertionSort(int[] list){
	
	int i, j, key , temp;

	for(i=1 ; i<list.length ; i++){
		key = list[i];
		j = i-1;
		
		while(j >=0 && key < list[j] ){
			//SWAP
			temp = list[j];
			list[j] = list[j+1];
			j--;
		}
	}
	return list;
}
	
}

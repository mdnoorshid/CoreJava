package com.learning.datastructure.sorting;

/**
 * A Sorting Algorithm is used to rearrange a given array elements according to
 * a comparison operator on the elements.
 * 
 * @author Md Noorshid
 */
public class Sorting {

	/*
	 * Insertion sort is a simple sorting algorithm that builds the final sorted
	 * array one item at a time.It is much less efficient on large lists than
	 * more advanced algorithms such as quicksort, heapsort, or merge sort.
	 * Every repetition of insertion sort removes an element from the input
	 * data, inserting it into the correct position in the already-sorted list,
	 * until no input elements remain. The choice of which element to remove
	 * from the input is arbitrary, and can be made using almost any choice
	 * algorithm.
	 * **Take key value and start comparing to its left, if it is lower than its left adjacent 
	 * number then swipe it.
	 * Time Complexity : O(n^2)
	 */
	public int[] insertionSorting(int[] arr) {
		int i , j ,key,temp;
		for( i = 1 ; i < arr.length ; i++){
			 key = arr[i];
			 j = i-1;
			while(j > 0 && key < arr[j]){
			    temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
		}
		return arr;
	}

	/*
	 * The selection sort algorithm sorts an array by repeatedly finding the
	 * minimum element (considering ascending order) from unsorted part and
	 * putting it at the beginning. The algorithm maintains two subarrays in a
	 * given array. Time Complexity : O(n^2)
	 */
	public int[] selectionSorting(int[] arr) {
		int n = arr.length;
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the maximum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}

				// Swap the found minimum element with the first
				// element

				int temp = arr[min_idx];
				arr[min_idx] = arr[i];
				arr[i] = temp;
			}

		}

		return arr;
	}

	/**
	 * Bubble Sort is the simplest sorting algorithm that works by repeatedly
	 * swapping the adjacent elements if they are in wrong order. Time
	 * Complexity : O(n^2)
	 * 
	 * @param arr
	 * @return
	 */
	public int[] bubbleSorting(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}
	
	
	

}

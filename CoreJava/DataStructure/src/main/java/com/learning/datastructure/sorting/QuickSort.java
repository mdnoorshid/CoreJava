package com.learning.datastructure.sorting;

/**
 * Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an
 * element as pivot and partitions the given array around the picked pivot.
 * There are many different versions of quickSort that pick pivot in different
 * ways. TimeComplexity best :O(nlog(n)) worst:O(n^2)
 * @author mdnoo
 *
 */
public class QuickSort {
	public int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// if current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++;
				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

	/**
	 * The main function that implements quickSort()
	 * 
	 * @param arr
	 *            --> to be sorted
	 * @param low
	 *            --> Starting index
	 * @param high
	 *            --> Ending Index
	 */
	public void sort(int arr[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);
			// Recursively sort elements before
			// partition and after partition
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		int arr[] = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;
		quickSort.sort(arr, 0, n - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}

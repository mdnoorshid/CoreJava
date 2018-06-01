package com.learning.datastructure.sorting;

/*Like QuickSort, Merge Sort is a Divide and Conquer algorithm. It divides input array in two halves,
calls itself for the two halves and then merges the two sorted halves. The merge() function is used
for merging two halves. The merge(arr, l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r]
are sorted and merges the two sorted sub-arrays into one.
**TimeComplexity: O(nlogn)
*Auxiliary Space: O(n)
*Algorithmic Paradigm: Divide and Conquer
*Sorting In Place: No in a typical implementation
*Stable: Yes
*
*/
public class MergeSort {

	private int[] array;
	private int[] tempMergeArr;
	private int length;

	public void sort(int[] inputArr) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArr = new int[length];
		doMergeSort(0, length - 1);
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}

	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergeArr[i] = array[i];
		}

		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		while (i <= middle && j <= higherIndex) {
			if (tempMergeArr[i] <= tempMergeArr[j]) {
				array[k] = tempMergeArr[i];
				i++;
			} else {
				array[k] = tempMergeArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergeArr[i];
			k++;
			i++;
		}

	}
	public static void main(String[] args) {
		int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(inputArr);
		for(int i:inputArr){
			System.out.print(i+" ");
		}
		
		
	}

}

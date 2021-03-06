package com.learning.datastructure.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Linear search:Linear search is also known as sequential search.
 * It checks the element to be searched with each element present in 
 * the list until the element is found.
 * Time Complexity : Best case O(1), Avg. case O(n) , Worst case O(n)
 * @author mdnoo
 *
 */
public class LinearSearch {

public boolean linearSearching(int[] arr, int key){
	boolean found = false;
	for(int i = 0; i<arr.length ; i++){
		if(arr[i] == key){
			found = true;
			break;
		}
	}
	return found;
}



public static void main(String[] args) {
	/*List<Integer> list =  Arrays.asList(1,8,5,77,8,1,5,6);
	List<Integer> sortedUniqueList = new ArrayList<>(new TreeSet<>(list));
	System.out.println("sortedUniqueList:: "+sortedUniqueList);*/
	/*list.stream().distinct().collect(Collectors.toList());
	list.stream().collect(Collectors.toSet());*/
	
	LinearSearch linearSearch = new LinearSearch();
	boolean linearSearching = linearSearch.linearSearching(new int[]{4,3,5,7,8,9}, 6);
	System.out.println(linearSearching);
	
    

}
	
}

package com.learning.datastructure.algo;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5,3,4,7,6,8,10,9};
        System.out.println(Arrays.toString(arr));
        mergeSort(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int l, int h,int[] arr){
        if(l<h){
           int mid = (l+h)/2;
           mergeSort(l,mid,arr);
           mergeSort(mid+1,h,arr);
           merge(l,h,mid,arr);
        }
    }

    /**
     * two way merge happening for array
     * @param l initial pos of array arr
     * @param h highest pos of array or right most part of the array arr
     * @param mid mid of the array arr
     * @param arr target array arr
     */
    public static void merge(int l,int h,int mid,int[] arr){
        int i = l; //initial pos of left side array
        int j=  mid+1; // initial pos of right side array
        int k = l; //initial pos of temp array
        int[] tempArr= new int[arr.length]; //temp array to store the sorted value
        while(i <= mid && j<=h){
            if(arr[i] < arr[j]){
                tempArr[k++] = arr[i++];
            }else{
                tempArr[k++] = arr[j++];
            }
        }
        if(i > mid){ //checking whether left part of array is totally exhausted
            while(j<=h) // filling tempArr with the remaining items left from right side array
            tempArr[k++] = arr[j++];
        }else{ //else right part of array is totally exhausted
            while(i<=mid)
            tempArr[k++] = arr[i++]; // filling tempArr with the remaining items left from left side array
        }
        //copying items from tempArray to arr
        for(int n = l ; n<=h ; n++){ // l is the initial index and h is the highest index of array arr
            arr[n] = tempArr[n];
        }
    }

}

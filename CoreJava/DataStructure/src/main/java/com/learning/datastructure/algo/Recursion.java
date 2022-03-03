package com.learning.datastructure.algo;

public class Recursion {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,8,9};
        System.out.println(binarySearchWithAlgo(0,arr.length-1,arr,7));
    }

    public static  int binarySearchWithAlgo(int l, int h, int[] arr , int key) {
        if ( l <= arr.length-1 && h>=0 && l<h) {
            if (l == h) { //smallest unit /base case
                if (arr[l] == key) {
                    return l;
                } else {
                    return -1;
                }
            } else {
                int mid = (l + h) / 2;
                if (arr[mid] == key) {
                    return mid;
                } else {
                    if (key < arr[mid])
                        return binarySearchWithAlgo(l, mid - 1, arr, key);//key is in left side of mid
                    else if(key > arr[mid])
                         return binarySearchWithAlgo(mid + 1, h, arr, key); //key is in right side of mid
                    else
                        return -1;
                }
            }
        }
        return -1;
    }


}

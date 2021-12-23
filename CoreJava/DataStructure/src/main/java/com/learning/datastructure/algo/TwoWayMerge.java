package com.learning.datastructure.algo;

import java.util.Arrays;

public class TwoWayMerge {


    private static int[] twoWayMerge(int[] a,int[] b){
       int[] c = new int[a.length+b.length];
       int i=0,j=0,k=0;
       while(i<a.length && j<b.length){
           if(a[i] < b[j]){
               c[k++] = a[i++];
           }else{
               c[k++] = b[j++];
           }
       }
       for(; i<a.length;i++)
             c[k++] = a[i];
        for(; j<b.length;j++)
            c[k++] = b[j];
       return c;
    }

    public static void main(String[] args) {
        int[] a = new int[]{5,7};
        int[] b = new int[]{6,9,11,13,14};
        int[] c = twoWayMerge(a, b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }

}

package com.advanced.dsa.algos.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={8,2,4,0,9,6,1};
        insertionSort(arr);
    }
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                //shift operation
                arr[j+1]=arr[j];
                j--;//the empty box[]
            }
            arr[j+1]=temp;//fill the empty box with temp
        }
        System.out.println(Arrays.toString(arr));
    }
}

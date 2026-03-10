package com.advanced.dsa.algos.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,8,3,7,4,2,3,0,1};
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int MinIdx=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[MinIdx]){
                    MinIdx=j;
                }
            }
            if(MinIdx!=i){
                //Swap
                int temp=arr[i];
                arr[i]=arr[MinIdx];
                arr[MinIdx]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

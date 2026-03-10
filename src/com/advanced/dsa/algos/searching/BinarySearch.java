package com.advanced.dsa.algos.searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int target=0;
        int result=binarySearch(arr,target);
        if(result==-1){
            System.out.println(target+" Target not found "+ Arrays.toString(arr));
        }else {
            System.out.println(target+" is present in index : "+result+" in "+Arrays.toString(arr));
        }
    }
    public static int binarySearch(int[] arr,int target){
        int start=0;
        int end =arr.length-1;
        while(start<=end) {
            int mid =start+(end-start)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;//move to right
            } else {
                end = mid - 1;//move to left
            }
        }
        return -1;//if target not found
    }
}

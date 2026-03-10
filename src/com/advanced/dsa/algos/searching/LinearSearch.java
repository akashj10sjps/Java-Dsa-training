package com.advanced.dsa.algos.searching;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int target=6;
        int result=linearSearch(arr,target);
        if(result==-1){
            System.out.println(target+" Target not found "+ Arrays.toString(arr));
        }else {
            System.out.println(target+" is present in index : "+result+" in "+Arrays.toString(arr));
        }
    }
    public static int linearSearch(int[] arr,int target){
        for(int i:arr){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

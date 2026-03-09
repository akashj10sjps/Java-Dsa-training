package com.basics.problems;

import java.util.Arrays;

public class MaxElementMinElement {
    public static void main(String[] args) {
        int[] arr={23,0,-2,41,100,94,2};
        int max=arr[0];//we assume the first to be max
        int min=arr[0];//we assume the first to be min
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum is :"+max);
        System.out.println("Maximum is :"+min);
    }
}

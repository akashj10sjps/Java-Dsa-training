package com.basics.problems;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={1,3,2,7};
        int target=9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println("Indices:"+i+","+j);
                    System.out.println("values:"+arr[i]+" ," +arr[j]);
                }
            }
        }
    }
}

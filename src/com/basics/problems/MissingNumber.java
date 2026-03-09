package com.basics.problems;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n=arr.length+1;
        int totalSum=n*(n+1)/2;
        int arrSum=0;
        for(int num:arr){
            arrSum+=num;
        }
        System.out.println("Arrray sum:"+arrSum);
        int missingNumber=totalSum-arrSum;
        System.out.println("Missing number:"+missingNumber);
    }
}

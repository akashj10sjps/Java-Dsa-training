package com.advanced.dsa.dataStructures.linear.queues;

public class SlidingWindowProblem {
    public static void main(String[] args) {
        /*
        Total windows formula : n-k+1-> 8-3+1=5+1=6
        Total windows= Total Length-window size+1
         */
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        for (int i = 0; i <= arr.length-k; i++) {
            int max=arr[i];
            for (int j = i; j <i+k ; j++) {
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            System.out.print(max+" ");
        }
        System.out.println();
    }
}

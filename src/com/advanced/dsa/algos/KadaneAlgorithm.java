package com.advanced.dsa.algos;
//Sum of maximum subset
public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr={5,-8,1,2,-1,4};
        System.out.println("Maximum subarray sum:"+kadaneAlgo(arr));
    }
    static int kadaneAlgo(int[] arr){
        int gmax=arr[0];
        int cmax=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            cmax=Math.max(arr[i],cmax+arr[i]);
            gmax=Math.max(cmax,gmax);
        }
        return gmax;
    }
}

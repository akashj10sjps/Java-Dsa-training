package com.advanced.dsa.algos.dynamicProgramming;

public class FibonacciSpaceOptimization {
    public static void main(String[] args) {
        int n=8;
        int p1=0;
        int p2=1;
        for (int i = 2; i <=n ; i++) {
            int curr=p1+p2;
            p1=p2;
            p2=curr;
        }
        System.out.println("The fibonacci of "+n+" is :"+p2);
    }
}

package com.advanced.dsa.algos.dynamicProgramming;

public class FibonacciTabulation {
    public static int fibonacci(int n){
        if(n<=1) return n;
        //Step 1: Create a DP array of size n+1
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        //Calculate the unknown value
        for (int i = 2; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(" the fibonacci at "+n+" is "+fibonacci(n));
    }
}

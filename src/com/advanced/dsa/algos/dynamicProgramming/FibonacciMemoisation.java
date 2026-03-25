package com.advanced.dsa.algos.dynamicProgramming;

import java.util.Arrays;

public class FibonacciMemoisation {
    public static int fib(int n ,int[] dp){
        if(n<=1) return n;
        //Step 2 : If u have the value ,don't calculate ,just return it
        if(dp[n]!=-1){
            return dp[n];
        }
        //Step 3: if u don't have the value calculate it
        return dp[n]=fib(n-1,dp)+fib(n-2,dp);
    }
    public static void main(String[] args) {
        int n=6;
        //Step 1:Initially we will take DP array of -1 values
        int[] dp=new int[n+1];//The starting fibonacci is 0
        Arrays.fill(dp,-1);
        System.out.println(" the fibonacci at "+n+" is "+fib(n,dp));
    }
}

package com.basics.methods.recursion;

public class SumOfNTerms {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
    public static int sum(int n){
        //base case if n==0-> return 0
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
}

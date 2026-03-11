package com.basics.methods.recursion;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
    public static int fibonacci(int n){
        //Base case
        if(n==0||n==1){
            return n;
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }
}

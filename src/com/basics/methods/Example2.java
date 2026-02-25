package com.basics.methods;

public class Example2 {
    public static void main(String[] args) {
        // store and print
        int sum= sumOfNTerms(10);
        System.out.println(sum);
        //directly print
        System.out.println(sumOfNTerms(10));
    }
    static int sumOfNTerms(int n){
        return n*(n+1)/2;
    }
}

package com.basics.loopingStatements;

public class Problem1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        for (int i = 1; i <5; i++) {
            System.out.println(i+ " ");
        }
        System.out.println();
        for (int i= 1;  i<5 ; ++i) {// in a for loop ++i and i++ are same
            System.out.println(i+ " ");
        }
    }
}

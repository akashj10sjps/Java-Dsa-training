package com.tripillar_coding_assignment.module1;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        //with third variable
        int a=10;
        int b=20;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a:"+a+" b:"+b);
        //without third variable
        int x=10;
        int y=20;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x:"+x+" y:"+y);
    }
}

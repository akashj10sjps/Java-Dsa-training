package com.tripillar_coding_assignment.module4;

public class FinalKeyword {
    public static void main(String[] args) {
        final int x=5;
        System.out.println("initial value :"+x);
        System.out.println("x remains constant: "+x);
        final StringBuilder s=new StringBuilder("hello");
        System.out.println("initial message:"+s);
        s.append("Akash");
        System.out.println("modified message"+s);
    }
}
// we cannot declare value of x two times if it is final
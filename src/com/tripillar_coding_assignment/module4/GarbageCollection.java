package com.tripillar_coding_assignment.module4;

public class GarbageCollection {
    public static void main(String[] args) {
        String s=new String("Hello");
        String s1=new String("Akash");
        s=s1;
        System.gc();
        System.out.println(s);
    }
}

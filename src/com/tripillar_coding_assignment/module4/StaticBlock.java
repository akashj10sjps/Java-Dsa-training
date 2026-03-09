package com.tripillar_coding_assignment.module4;

public class StaticBlock {
    static{
        System.out.println(" It is executed earlier than Main mathod");
        System.out.println("waiting for  execution of main method....");
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("addition value is:"+(a+b));
    }
}

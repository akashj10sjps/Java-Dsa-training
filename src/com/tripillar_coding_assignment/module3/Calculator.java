package com.tripillar_coding_assignment.module3;

public class Calculator {
    int a;
    int b;
    void add(){
        System.out.println("Addition answer is:"+(a+b));
    }
    void subtract(){
        System.out.println("Subtraction answer is:"+(a-b));
    }
    public static void main(String[] args) {
        Calculator op=new Calculator();
        op.a=20;
        op.b=10;
        op.add();
        op.subtract();
    }
}

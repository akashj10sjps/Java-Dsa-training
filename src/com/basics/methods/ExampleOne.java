package com.basics.methods;

public class ExampleOne {
    static int x=10;
    public static void main(String[] args) {
       // ExampleOne obj=new ExampleOne();
        //obj.add(1,2);
        add(1,2);//method call
        // the actual values passed during metho
        System.out.println();
    }
    static void add(int a,int b){
        System.out.println(a+b);
        System.out.println(x);
    }
}

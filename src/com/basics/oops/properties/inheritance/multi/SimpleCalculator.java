package com.basics.oops.properties.inheritance.multi;

public class SimpleCalculator {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void sub(int a,int b){
        System.out.println(a-b);
    }
}
class AdvancedCalculator extends SimpleCalculator{
    void divide(float a,float b){
        System.out.println(a/b);
    }
    void multiply(int a,int b){
        System.out.println(a*b);
    }
}
class SuperAdvancedCalculator extends AdvancedCalculator{
    void square(int x){
        System.out.println(Math.pow(x,2));
    }
    void cube(int x){
        System.out.println(Math.pow(x,3));
    }

    public static void main(String[] args) {
        System.out.println("==============================");
        SimpleCalculator c1=new SimpleCalculator();
        c1.add(4,5);
        c1.sub(4,5);
        System.out.println("==============================");
        AdvancedCalculator c2=new AdvancedCalculator();
        c2.sub(5,4);
        c2.add(4,5);
        c2.multiply(4,5);
        c2.divide(4,5);
        System.out.println("==============================");
        SuperAdvancedCalculator c3=new SuperAdvancedCalculator();
        c3.add(4,5);
        c3.sub(4,5);
        c3.multiply(4,5);
        c3.divide(4,5);
        c3.square(4);
        c3.cube(5);

    }
}

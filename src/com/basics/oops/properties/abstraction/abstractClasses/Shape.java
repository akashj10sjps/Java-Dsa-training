package com.basics.oops.properties.abstraction.abstractClasses;

abstract class Shape {
    abstract void area(int a);
}
class Square extends Shape{
    @Override
    void area(int l) {
        System.out.println(Math.pow(l,2));
    }
}
class Circle extends Shape{
    @Override
    void area(int r) {
        System.out.println(Math.PI*Math.pow(r,2));
    }
}
class Main{
    public static void main(String[] args) {
        Square square=new Square();
        Shape circle=new Circle();
        square.area(2);
        circle.area(2);
    }
}

package com.tripillar_coding_assignment.module4;

abstract class Shape {
    abstract void display();
}
class Circle extends Shape{
    @Override
    void display(){
        System.out.println("Tripillar coding assignment");
    }

    public static void main(String[] args) {
        Shape c=new Circle();
        c.display();
    }
}
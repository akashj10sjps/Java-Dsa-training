package com.basics.oops.properties.abstraction.interfaces;

public interface Demo {
    void display();
}
class Main {
    public static void main(String[] args) {
        //Can we create and object of an interface
        Demo obj =new Demo(){
            @Override
            public void display(){
                System.out.println("Normal code -boilerplate code");
            }
        };
        obj.display();
        Demo obj1=()-> System.out.println("SACLA code -boilerplate code");
        obj1.display();
        //SCALA -java -8:Lambda Expressions
    }
}

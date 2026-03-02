package com.basics.oops.properties.inheritance.single;

public class Animal { //parent Class //super class
    void eat(){
        System.out.println("Animals eat some food!");
    }
}
class Cat extends Animal{ //child class
    void run(){
        System.out.println("cats run very fast.");
    }

    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.run();
        cat.eat();
    }
}
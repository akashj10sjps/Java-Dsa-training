package com.basics.oops.properties.abstraction.interfaces;

public interface Animal {
    void run();
    void loves_to_eat();
}
class Rat implements Animal{
//interfaces have methods with completely empty bodies
    //interfaces don't have normal methods
    //so they exhibit 100% abstraction
    //the methods are defined in the child class
    @Override
    public void run() {
        System.out.println("Rats run fast");
    }

    @Override
    public void loves_to_eat() {
        System.out.println("Rats love to eat cheese.");
    }
}
class Cat implements Animal{
    @Override
    public void run() {
        System.out.println("cats run very fast");
    }

    @Override
    public void loves_to_eat() {
        System.out.println("cats love to rats.");
    }
}
class InterfaceDemo{
    public static void main(String[] args) {
        Rat rat=new Rat();
        Cat cat=new Cat();
        rat.run();
        rat.loves_to_eat();
        cat.run();
        cat.loves_to_eat();
    }
}

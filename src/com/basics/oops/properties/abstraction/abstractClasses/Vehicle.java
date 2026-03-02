package com.basics.oops.properties.abstraction.abstractClasses;

abstract class Vehicle {
    // two types of methods
    //1.normal or concrete
    void vehicle_type(){
        System.out.println("two wheeler or four wheeler");
    }
    abstract void start();
    //this method will be defined in the child class
    //abstract method cannot have a body
    //if there are only abstract methods-100% abstraction
    //if there is one normal method -not 100% abstraction

}
class hayabusa extends Vehicle{

    @Override
    void start() {
        System.out.println("starts with kick");
    }
}
class rollsroyce extends Vehicle{
    @Override
    void start() {
        System.out.println("starts with self");
    }
}
class Demo{
    public static void main(String[] args) {
        hayabusa bike=new hayabusa();
        rollsroyce car=new rollsroyce();
        bike.start();
        bike.vehicle_type();
        car.start();
        car.vehicle_type();
    }
}
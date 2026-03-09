package com.tripillar_coding_assignment.module4;

public interface Vehicle {
    void start();
}
class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("need key to start");
    }

    public static void main(String[] args) {
        Car c=new Car();
        c.start();

    }
}

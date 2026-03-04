package com.basics.threads;

public class FoodOrder extends Thread{
    String task;
    FoodOrder(String task){
        this.task=task;
    }
    public void run(){
        System.out.println(task+"started");
    }

    public static void main(String[] args) {
        FoodOrder cooking =new FoodOrder("Cooking");
        FoodOrder packing=new FoodOrder("packing");
        FoodOrder delivery=new FoodOrder("Asigning Delivery agent");
        cooking.start();
        packing.start();
        delivery.start();
    }
}
// extend thread
//override run()
//use start()
//Less flexible due to inheritance limitations

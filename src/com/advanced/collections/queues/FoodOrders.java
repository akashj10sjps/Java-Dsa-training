package com.advanced.collections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders=new LinkedList<>();
        //For adding elements [add][strict] [offer][lenient]
        orders.add("Order101");
        orders.offer("Order102");
        orders.offer("Order103");
        //for removing elements [remove][strict] [poll][lenient]
        System.out.println("orders are:"+orders);
        orders.remove();
        System.out.println("Orders are:"+orders);
        orders.poll();
        System.out.println("Orders are:"+orders);
    }
}

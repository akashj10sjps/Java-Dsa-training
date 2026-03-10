package com.advanced.collections.base;

import com.basics.oops.properties.inheritance.multiple.A;

import java.util.ArrayList;
import java.util.Collection;

public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveOrders=new ArrayList<>();
        liveOrders.add("ORDER101");
        liveOrders.add("ORDER102");
        liveOrders.add("ORDER103");
        //Check order
        System.out.println("ORDER101 Available? Exists?  "+liveOrders.contains("ORDER101"));
        //check all the orders
        System.out.println("Live Orders:"+liveOrders);
        liveOrders.remove("ORDER101");
        System.out.println("ORDER101 Available? Exists?  "+liveOrders.contains("ORDER101"));
        System.out.println("Live Orders:"+liveOrders);
        System.out.println("Total live orders:"+liveOrders.size());
        liveOrders.clear();
        System.out.println("Current orders :"+liveOrders);
    }
}

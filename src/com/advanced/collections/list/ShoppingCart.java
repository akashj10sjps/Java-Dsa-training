package com.advanced.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart=new ArrayList<>();
        cart.add("laptop");
        cart.add("mouse");
        cart.add("keyboard");
        //mouse no longer needed
        cart.remove("mouse");//remove
        System.out.println("Latest cart:"+cart);
        cart.set(1,"Mechanical keyboard");//replace ->set
        System.out.println("After update:"+cart);
    }
}

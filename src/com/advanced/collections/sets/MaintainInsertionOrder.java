package com.advanced.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MaintainInsertionOrder {
    public static void main(String[] args) {
        HashSet<Integer> set=new LinkedHashSet<>();
        set.add(2);
        set.add(12);
        set.add(4);
        set.add(20);
        set.add(6);
        set.add(7);
        set.add(3);
        set.add(2);
        System.out.println(set);
    }
}

package com.advanced.collections.maps;

import java.util.Hashtable;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Anushree");//modulo by 11
        ht.put(117, "Naveen");
        ht.put(128, "Likith");
        ht.put(102, "Hitler");
        ht.put(99, "Alexander");
        ht.put(98, "Pablo");
        System.out.println(ht.getOrDefault(99,"Not Found "));
        System.out.println(ht.getOrDefault(101,"Not Found "));
        ht.putIfAbsent(90,"Akash");
        System.out.println("Update Table:"+ht);
        ht.putIfAbsent(102,"Saurav");
        System.out.println("Update Table:"+ht);//it won't update if key and value exists
    }
}

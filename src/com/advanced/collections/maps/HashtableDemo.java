package com.advanced.collections.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(106,"Anushree");//modulo by 11
        ht.put(117,"Naveen");
        ht.put(128,"Likith");
        ht.put(102,"Hitler");
        ht.put(99,"Alexander");
        ht.put(98,"Pablo");
        System.out.println(ht);
        for(Map.Entry<Integer,String> entry :ht.entrySet()){
            System.out.println(entry.getKey()+"<->"+ entry.getValue());
        }
    }

}

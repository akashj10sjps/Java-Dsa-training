package com.advanced.collections.maps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

//remove some values in a list using Iterator
//the Iterator is an interface in Collections Library in java
//It is used to navigate & perform certain operations
public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(21);
        numbers.add(13);
        numbers.add(15);
        System.out.println("Before:"+numbers);
        Iterator<Integer> it= numbers.iterator();
        while(it.hasNext()){
            Integer i= it.next();
            //remove the numbers >10
            if(i>10){
                it.remove();
            }
        }
        System.out.println("After:"+numbers);
    }
}

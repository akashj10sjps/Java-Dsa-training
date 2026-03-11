package com.advanced.collections.maps;

import java.util.ArrayList;
import java.util.Iterator;

//remove some values in a list using Iterator
//the Iterator is an interface in Collections Library in java
//It is used to navigate & perform certain operations
public class RemoveUsingLambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(11);
        numbers.add(21);
        numbers.add(13);
        numbers.add(15);
        System.out.println("Before:"+numbers);
        numbers.removeIf(n->n>10);
        System.out.println("After:"+numbers);
    }
}

package com.basics.exceptions;

public class E3 {
    static void checkAge(int age){
        if(age >=18){
            System.out.println("access granted-eligible");
        }else{
           // System.out.println("acces denied-not eligible");
            throw new RuntimeException("access denied-not eligible");
        }
        System.out.println("user starts the app");
    }
    public static void main(String[] args) {
        checkAge(20);
    }
}

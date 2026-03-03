package com.basics.strings;

public class DifferenceDemo {
    public static void main(String[] args) {
        String s="Java";
        //hashcode -> unique id or no given by jvm
        System.out.println("string before:"+s.hashCode());
        s=s+" DSA";
        System.out.println(s.hashCode());
        // this proves that strings are immutable
//        for (int i = 0; i < 1000; i++) {
//            s=s+"dsa";
//        }this is bad because it creates 1000 objects
//        StringBuffer &StringBuilder
        StringBuilder builder=new StringBuilder();
        System.out.println("builder before "+builder.hashCode());
        builder.append("DSA");
        System.out.println("builder after:"+builder.hashCode());
    }
}

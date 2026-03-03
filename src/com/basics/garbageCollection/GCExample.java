package com.basics.garbageCollection;

public class GCExample {
    public static void main(String[] args) {
        String s1=new String("java");
        String s2=new String("python");
        s1=s2;
       // System.gc();we wrote this for previous versions
        //now it is not mandatory
        //now , int the SCP-> "java" is not available
        //this proves that garbage collection is automatic
        // any unused data is cleared =garbage collection
        System.out.println(s1);
    }
}

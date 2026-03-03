package com.basics.staticKeyword;

public class Example {
    //static belongs to stack memory no objects are needed
    // no objects are needed for it
    // the static block executes with the class before main()
    static int x=2;
    static{
        System.out.println("Open the system");
    }
    public static void main(String[] args) {
        System.out.println("sapthagiri ece");
        System.out.println(x);
    }
    static {
        System.out.println("start the app");
    }
}

package com.basics.methods;

public class Example4 {
    public static void main(String[] args) {
        System.out.println("maxpieces:"+maxPieces(5));
        System.out.println("maxregions:"+maxRegions(4));
    }
    static int maxPieces(int n){
        return ((n*(n+1))/2)+1;
    }
    static int maxRegions(int n){
        return ((n*(n+1))/2)+1;
    }
}

package com.basics.arrays;
//Varargs -> ... for an array {it internally uses arrays}//SASKEN
public class E7 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        display(arr);
    }
    public static void display(int... arr){
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}

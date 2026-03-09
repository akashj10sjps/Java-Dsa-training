package com.basics.arrays;

public class E5 {
    //how to pass an array to a method(function)
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        printArray(arr);
        int[] result=createArray();
        for(int num:result){
            System.out.print(num+" ");
        }
        System.out.println();
        printArray(new int[]{10,20,30,40,50});//anonymous array-> it is directly call()
        //after the method call we cannot access the array elements
    }
    public static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static int[] createArray(){//will return an array of integers
        return new int[]{4,5,6,7,8};
    }

}

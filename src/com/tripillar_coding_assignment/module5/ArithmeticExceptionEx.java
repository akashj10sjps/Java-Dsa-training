package com.tripillar_coding_assignment.module5;

public class ArithmeticExceptionEx {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=0;
        try{
            k=i/j;
        }catch (ArithmeticException e){
            System.out.println("There is Arithmetic Logical Error");
        }
        System.out.println("the value of k is :"+k);
    }


}

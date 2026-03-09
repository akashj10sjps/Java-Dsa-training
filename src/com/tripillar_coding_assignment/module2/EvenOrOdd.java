package com.tripillar_coding_assignment.module2;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        if((n&1)==0){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }
    }
}

package com.basics.loopingStatements;

import java.util.Scanner;

public class PrintEvenOddInRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            if(i%2==0){
                System.out.println(i+" is even");
            }else{
                System.out.println(i+" is odd");
            }
            i++;
        }
    }
}

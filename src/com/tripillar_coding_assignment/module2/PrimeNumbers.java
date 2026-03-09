package com.tripillar_coding_assignment.module2;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        int n= sc.nextInt();
        boolean isPrime=true;
        for (int i = 2; i*i<n; i++) {
            if((n%i)==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(n+" is prime");
        }else{
            System.out.println(n+" is not prime");
        }
    }
}

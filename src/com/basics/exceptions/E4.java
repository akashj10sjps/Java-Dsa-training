package com.basics.exceptions;

public class E4 {
    static void withdraw(int tb,int amount){
        final int minBalance=2000;
        if(tb-amount<minBalance){
            throw new RuntimeException("Minimum balance of 2000 must be maintained");
        }
        System.out.println("Withdraw succesfull");
        System.out.println("remaining Balance:"+(tb-amount));
    }

    public static void main(String[] args) {
        withdraw(5000,2000);
    }
}

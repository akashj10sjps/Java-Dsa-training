package com.tripillar_coding_assignment.module3;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        System.out.println("square of "+n+" is:"+squareofnum(n));
    }
    static int squareofnum(int n){
        int square=n*n;
        return square;
    }
}

package com.tripillar_coding_assignment.basics_operators;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of radius");
        int radius=sc.nextInt();
        double area=Math.PI*radius*radius;
        System.out.println("Area of circle is:"+area);
    }
}

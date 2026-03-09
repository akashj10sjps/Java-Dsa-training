package com.tripillar_coding_assignment.module1;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of celsius");
        int celsius=sc.nextInt();
        double fahrenheit=((celsius*1.8)+32);
        System.out.println("fahrenheit value is :"+fahrenheit);
    }
}

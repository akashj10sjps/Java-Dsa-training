package com.tripillar_coding_assignment.module2;

public class LeapYear {
    public static void main(String[] args) {
        int year=2000;
        if((year%4)==0 && (year%100)!=0 || (year%400)==0){
            System.out.println(year+" is a leapyear");
        }else{
            System.out.println(year+" is Not a Leapyear");
        }
    }
}

package com.tripillar_coding_assignment.module3;

public class PositiveNegativeNum {
    public static void main(String[] args) {
        signcheck(7);
        signcheck(-6);
        signcheck(0);
    }
    static void signcheck(int n){
        int sign=n>>31;
        if(sign==0){
            if(n==0){
                System.out.println(n+" is Zero");
            }else{
                System.out.println(n+" is Positive");
            }
        }else{
            System.out.println(n+" is Negative");
        }
    }
}

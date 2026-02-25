package com.basics.patterns;

public class RightAngleTri {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int r = 1; r <=n; r++) {
            for (int c = 1; c <=r ; c++) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int r = 1; r <=n; r++) {
            for (int c = 1; c <=r ; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

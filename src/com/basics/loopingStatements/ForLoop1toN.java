package com.basics.loopingStatements;

public class ForLoop1toN {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            System.out.print(i+ "\t");// slash t is 4spaces
        }
        System.out.println();
        for(int i=n;i>=1;i--) {
            System.out.print(i + "\t");
        }
    }
}

package com.basics.loopingStatements;

public class ContinueStatement {
    public static void main(String[] args) {
        //continue skips the current value and goes to the next value
        for (int i = 1; i <5 ; i++) {
            if(i==3){
                continue;
            }
            System.out.println(i+" ");

        }
    }
}

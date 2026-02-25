package com.basics.loopingStatements;

public class BreakStatement {
    public static void main(String[] args) {
        //break ends the loop amd goes out of the loop
        for (int i = 1; i <5 ; i++) {
            if(i==3){
                break;
            }
            System.out.println(i+" ");

        }
    }
}

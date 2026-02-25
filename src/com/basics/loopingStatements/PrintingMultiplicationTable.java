package com.basics.loopingStatements;

public class PrintingMultiplicationTable {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){//row
            for(int j=1;j<=10;j++){//column
                System.out.print(i+" x "+j+" = "+i*j +"\t");
            }
            System.out.println();
        }
    }
}

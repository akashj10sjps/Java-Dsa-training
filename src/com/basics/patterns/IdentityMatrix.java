package com.basics.patterns;

public class IdentityMatrix {
    public static void main(String[] args) {
        identity(5);
    }
    static void identity(int n){
        for (int r = 1; r <=n; r++) {
            for (int c = 1; c <=n ; c++) {
                if(r==c){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }

            }
            System.out.println();

        }
    }
}

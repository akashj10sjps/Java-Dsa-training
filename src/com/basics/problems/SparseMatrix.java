package com.basics.problems;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,1,0},
                {0,1,1},
                {1,0,2}};
        int zeros=0;
        int nonzeros=0;
        for (int[] row:arr) {
            for(int col:row){
                if(col==0){
                    zeros++;
                }else{
                    nonzeros++;
                }
            }
        }
        if(zeros>nonzeros) {
            System.out.println("Sparse matrix");
        } else if (zeros==nonzeros) {
            System.out.println("Cannot be determined");
        } else{
            System.out.println("Not a Sparse matrix");
        }
    }
}

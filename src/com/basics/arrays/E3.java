package com.basics.arrays;
//types of array
public class E3 {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};// 1D array
        System.out.println(arr.length);
        //2D array or matrix
        int[][] matrix={{1,2,3},//0
                        {4,5,6},//1
                        {7,8,9},//2
                        {9,8,7}};//3
        // Total number of rows=length of the matrix
        System.out.println(matrix.length);//Total number of rows
        System.out.println(matrix[0].length);//length of 1st row
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
        //when in 2D array or matrix -the rows are not equal
        //this type of array is called "JAGGED ARRAY"
        char[][] lang={{'k','a','n','n','a','d','a'},
                        {'T','e','l','u','g','u'},
                        {'m','a','l','a','y','a','l','a','m'},
                        {'T','a','m','i','l'}};
        System.out.println(lang[0].length);//length of 1st row
        System.out.println(lang[1].length);//length of 2nd row
        System.out.println(lang[2].length);//length of 3rd row
        System.out.println(lang[3].length);//length of 4th row
        // traversal in a jagged array
        for (int r = 0; r < lang.length; r++) {
            for (int c = 0; c < lang[r].length; c++) {
                System.out.print(lang[r][c]+" ");
            }
            System.out.println();
        }
        int[][] jagged ={{1,2,3,4,5,6,7,8},
                        {1,2,3,4,5},
                        {1,2}};
        for (int r = 0; r < jagged.length; r++) {
            for (int c = 0; c < jagged[r].length; c++) {
                System.out.print(jagged[r][c]+" ");
            }
            System.out.println();
        }
    }
}

package com.basics.arrays;

public class E4 {
    public static void main(String[] args) {
        int[][] numbers={{1,2,3,4,5},
                        {6,7},
                        {8}};
        for (int[] x:numbers) {
            for(int n:x){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        char[][] names={{'a','k','a','s','h'},
                        {'n','a','v','e','e','n'},
                        {'l','i','k','i','t','h'},
                        {'a','b','c'},
                        {'e','f','g'}};
        for (char[] x:names) {
            for(char n:x){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        boolean[][] data={{true,false,true},
                          {false},
                          {true,true}};
        for(boolean[] bool:data){
            for(boolean b:bool){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}

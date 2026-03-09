package com.basics.arrays;

public class E1 {
    public static void main(String[] args) {
        //method 1
        int[] arr;//Declaration
        arr= new int[5];//memory Allocation [20 bytes] [4 bytes x 5Blocks]
        String[] arr1;
        arr1=new String[5];
        System.out.println(arr1[4]);
        //if we do not provide any value ,
        //the JVM uses "FALLBACK MECHANISM"
        //it uses the default values of the particular data typr
        //int->0 ,float->0.0,String->null,boolean->false,char ->null
        //Declaration & memory allocation
        //method 2
        int[] arr2 = new int[5];
        System.out.println(arr[4]);
        int[] arr3={1,2,3,4,5,6};//Assigning custom values
        System.out.println(arr3[3]);
        //method 4
        int[] arr4=new int[]{2,3,4,5,6,7};
        System.out.println(arr4[0]);
    }
}

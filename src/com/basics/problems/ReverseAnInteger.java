package com.basics.problems;

public class ReverseAnInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-321));
    }
    public static int reverse(int x) {
        long reversed=0;
        int temp=x;
        while(temp!=0){
            int digit=temp%10;
            reversed=reversed*10+digit;
            temp/=10;
        }
        if(reversed>Integer.MAX_VALUE||reversed<Integer.MIN_VALUE){
            return 0;
        }
        return (int)reversed;
    }
}

package com.basics.methods;

public class Example5 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
        System.out.println("hw-7:"+hammingWeight(7));
        System.out.println(hammingWeight(15));
    }
    static int hammingWeight(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}

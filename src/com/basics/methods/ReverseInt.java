package com.basics.methods;

public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reverseInteger(567));
        System.out.println(reverseInteger(21));
    }
    static int reverseInteger(int n){
        int ans=0;
        while (n>0) {
            ans = (ans * 10 + n % 10);
            n=n/10;
        }
        return ans;
    }
}

package com.advanced.dsa.algos.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int target=sc.nextInt();
        int result=squareRoot(target);
        if(result==-1){
            System.out.println(target+" Target not found ");
        }else {
            System.out.println(target+" is square root of: "+result);
        }
    }
    public static int squareRoot(int n){
        int start=0;
        int end =n;
        int ans=-1;
        while(start<=end) {
            int mid =start+(end-start)/2;
            if (mid*mid == n) {
                return mid;
            }
            if (mid*mid< n) {
                start = mid + 1;//move to right
            } else {
                end = mid - 1;//move to left
            }
            ans=mid+1;
        }
        return ans;//if target not found
    }
}

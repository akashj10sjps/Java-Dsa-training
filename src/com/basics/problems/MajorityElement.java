package com.basics.problems;
//Boyer Moore's algorithm
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,2,3,2,2,3,3,3,3};
        int count=0;
        int canditate=0;
        for (int i = 0; i < arr.length; i++) {
            if(count==0){
                canditate=arr[i];
            }
            if(arr[i]==canditate){
                count++;
            }else{
                count--;
            }
        }
        System.out.println("Winner is:"+canditate);
    }
}

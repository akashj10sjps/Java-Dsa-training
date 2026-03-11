package com.basics.arrays;
import java.util.Scanner;
public class RotateArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int k=2;
            if(n>0){
                int rotation=k%n;
                for(int i=rotation;i<n;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<rotation;i++){
                    System.out.print(arr[i]+" ");
                }
            }

            // code here
            scanner.close();
        }
}


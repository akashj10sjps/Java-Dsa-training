package com.basics.conditionalStatements;
import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args) {
        // object Classname obj=new Classname()
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        int a = sc.nextInt();
        if(a%2==0){
            if(a%4==0){
                System.out.println("number is divi by 4");
            }else{
                System.out.println("number is not divi by 4");
            }
        }else{
            if(a%3==0){
                System.out.println("number is divi by 3");
            }else{
                System.out.println("number is not divi by 3");
            }

        }
    }
}

package com.tripillar_coding_assignment.module5;

public class TryCatchFinallyEx {
    public static void main(String[] args) {
        int a,b,c=0;
        a=20;
        b=10;
        String name="Akash";
        try{
            c=a/b;
            name.charAt(9);
        }catch (ArithmeticException e){
            System.out.println("there is an Arithmetic error");
        }catch(StringIndexOutOfBoundsException s){
            System.out.println("Invalid input");
        }finally {
            System.out.println("code execution successfull");
        }
        System.out.println("the value of c is:"+c);
    }
}

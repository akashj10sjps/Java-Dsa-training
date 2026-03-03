package com.basics.strings;

public class StringConstantPool {
    public static void main(String[] args) {
        //they have same literal value "Java"
        String s1="Java";
        String s2="Java";
        System.out.println(s1.equals(s2));
        String s3=new String("Java");
        System.out.println(s1==s3);//object check comparing
        System.out.println(s1.equals(s3));//values check comparing
    }
}

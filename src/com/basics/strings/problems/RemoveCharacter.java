package com.basics.strings.problems;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str ="Programming";
        char ch='r';
        String result="";
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)!=ch){
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
    }
}

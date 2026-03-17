package com.advanced.dsa.dataStructures.linear.stacks;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s1="{[()]}";
        String s2="{[}](}";
        String s3="{{[[";
        System.out.println(s1+" -> "+(isValidParentheses(s1)?"Valid":"Invalid"));
        System.out.println(s1+" -> "+(isValidParentheses(s2)?"Valid":"Invalid"));
        System.out.println(s1+" -> "+(isValidParentheses(s3)?"Valid":"Invalid"));
    }
    static boolean isValidParentheses(String s){
        Stack<Character> stack = new Stack<>();
        //"{[()]}"=>'{','{',')',']','}'
        for (char c:s.toCharArray()) {
            if(c=='{'||c=='['||c=='('){
                stack.push(c);//push opening brackets
            }else{
                if(stack.empty()){
                    return false;
                }
                char top=stack.pop();
                //In all the mismatch cases return false
                if(c=='}'&&top!='{') return false;
                if(c==')'&&top!='(') return false;
                if(c==']'&&top!='[') return false;
            }
        }
        //If the string is valid parentheses if all the brackets are removed
        //It is Invalid even if one character is present in it
        //This will happen when there are mismatched elements
        return stack.empty();
    }
}

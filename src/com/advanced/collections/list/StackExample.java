package com.advanced.collections.list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Top element using peek:"+stack.peek());
        int top =stack.pop();
        System.out.println("Top element:"+top);
        System.out.println("Remaining stack :"+stack);
        System.out.println("Top element using peek:"+stack.peek());
        System.out.println("Size of stack:"+stack.size());
        System.out.println("Stack is empty:"+stack.empty());
    }

}

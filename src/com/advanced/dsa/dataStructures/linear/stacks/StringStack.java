package com.advanced.dsa.dataStructures.linear.stacks;

public class StringStack {
    private static final int MAX_SIZE=10;
    private String[] arr = new String[MAX_SIZE];
    private int top = -1;//Initially the stack is empty
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==MAX_SIZE-1;
    }
    public void push(String data){
        if(isFull()){
            System.out.println("Stack Overflow.Can't push more elements");
            return;
        }
        arr[++top]=data;//Increment the top and add the element at that index
        System.out.println("the String "+data+" was pushed to the stack");
    }
    public String pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow.Can't remove elements");
            return null;//Because its String so we return null
        }
        String popped =arr[top--];
        return popped;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack Underflow.Can't display elements");
            return;
        }
        System.out.println("the stack elements from top to bottom (LIFO):");
        for (int i = top; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public String peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow.No top elements");
            return null;
        }
        return arr[top];
    }
    public int size(){
        //No elements,Single elements,multiple elements
        return top+1;//One formula for all cases
    }

    public static void main(String[] args) {
        StringStack stack=new StringStack();
        stack.pop();
        stack.push("Hitler");
        stack.push("Alexander");
        stack.push("Akash");
        System.out.println(stack.peek());
        String popped= stack.pop();
        System.out.println("Pooped: "+popped);
        System.out.println("Size: "+stack.size());
    }
}

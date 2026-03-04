package com.basics;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actionsp
public class Main{
    public static void main(String[] args) {
        int x = 20;
        char c = 'a';
        double d = 6.5;
        float f = 6.5f;
        byte b = 127;//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(f);
        String r1=(2 > 3)? "true":"false";
        boolean r2=(2 > 3)? true:false;
        int r3=(2 > 3)? 1:0;
        System.out.println(r1+" "+r2+" "+r3);
        System.out.println((2 > 3)? 1:0);
        System.out.println(Thread.currentThread().getName());
    }
}

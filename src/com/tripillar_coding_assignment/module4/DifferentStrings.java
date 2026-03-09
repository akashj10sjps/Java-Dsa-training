package com.tripillar_coding_assignment.module4;

public class DifferentStrings {
    public static void main(String[] args) {
        String s="Akash";
        System.out.println("String before Modification :"+s);
        s.concat("Hitler");
        System.out.println("String After Modification :"+s);
        StringBuilder builder =new StringBuilder("Akash");
        System.out.println("StringBuilder before Modification :"+builder);
        builder.append(" Hitler");
        System.out.println("StringBuilder After Modification :"+builder);
        StringBuffer buffer=new StringBuffer("Akash");
        System.out.println("StringBuffer before Modification :"+buffer);
        buffer.append(" Hitler");
        System.out.println("StringBuffer After Modification :"+buffer);
    }
}
//String cannot be modified whereas StringBuilder and StringBuffer can be modified
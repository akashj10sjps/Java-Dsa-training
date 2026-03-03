package com.basics.strings;

public class StringMethods {
    public static void main(String[] args) {
        String str="Naveen Kumar";
        System.out.println("Length:"+str.length());
        System.out.println("Char at index 2:"+str.charAt(2));
        System.out.println("Char at last index:"+str.charAt(str.length()-1));
        System.out.println("uppercase:"+str.toUpperCase());
        System.out.println("lowercase:"+str.toLowerCase());
        System.out.println("substring:"+str.substring(0,5));
        System.out.println("equals(Naveen Kumar):"+str.equals("aveen Kumar"));
        System.out.println("equals(Case doesnt matter):"+str.equalsIgnoreCase("naveen kumar"));
        String jumble="Naveen1is1true1";
        String[] words=jumble.split("1");//remove common words
        System.out.println(words[2]);
        String name="       Likith A       ";
        System.out.println(name.trim());//remove spaces from start and end
        char[] letters={'m','a','l','l','i'};
        //String word=letters.toString();only works for wrapper classes
        String word= new String(letters);
        System.out.println(word);
    }
}

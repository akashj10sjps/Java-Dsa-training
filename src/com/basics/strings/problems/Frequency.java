package com.basics.strings.problems;

import java.util.Scanner;

public class Frequency {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String inputString = scanner.nextLine();
            int[] freq=new int[26];
            int maxFreq=0;
            for(int i=0;i<inputString.length();i++){
                int index =inputString.charAt(i)-'a';
                freq[index]++;
                if(freq[index]>maxFreq){
                    maxFreq=freq[index];
                }
            }
            StringBuilder result=new StringBuilder();
            for(int i=0;i<26;i++){
                if(freq[i]==maxFreq){
                    if(result.length()>0){
                        result.append(" ");
                    }
                    result.append((char)(i+'a'));
                }
            }
            System.out.println(result.toString().trim());
            //code here
            scanner.close();

        }


}


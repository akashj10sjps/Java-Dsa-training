package com.basics.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E6 {
    public static void main(String[] args) throws Exception{
        //BufferedReader br=null;
        String str;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
           // br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter any data");
            str=br.readLine();
            System.out.println(str);
            br.close();
        }
    }
}

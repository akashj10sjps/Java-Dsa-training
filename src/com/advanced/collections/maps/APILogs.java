package com.advanced.collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class APILogs {
    public static void main(String[] args) {
        Map<String,String> logs=new LinkedHashMap<>();
        logs.put("1","SignUp");
        logs.put("2","Login");
        logs.put("3","Browse instagram reels");
        logs.put("4","Scroll Up & Down");
        logs.put("5","Log Out");
        System.out.println(logs);
    }
}

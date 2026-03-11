package com.advanced.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class LoginSystem {
    public static void main(String[] args) {
        Map<String,String> user=new HashMap<>();
        user.put("admin","admin@123");
        user.put("user1","pass1");
        user.put("user2","pass2");
        System.out.println(user);
        user.put("admin","admin@432");//update
        System.out.println(user);
        //How do fetch the password of a user?
        System.out.println(user.get("admin"));
    }
}



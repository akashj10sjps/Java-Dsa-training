package com.basics.oops.properties.encapsulation;

public class Employee {
    private int id;
    private String emailid;
    //setters
    public void setId(int id){
        this.id=id;
    }
    public void setEmail(String emailid){
        this.emailid=emailid;
    }
    //getters
    public int getId(){
        return id;
    }
    public String getEmailidmail(){
        return emailid;
    }

}

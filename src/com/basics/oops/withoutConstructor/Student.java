package com.basics.oops.withoutConstructor;

public class Student {
    //instance variables
    int USN;
    String name;
    int marks;
    void evaluate(){
        if(marks<45){
            System.out.println(name+" has failed");
        }else{
            System.out.println(name+" is passed");
        }
    }
    public static void main(String[] args) {
        //object creation syntax: Classname obj=new classroom()
        Student s1=new Student();
        s1.USN=101;
        s1.name="akash";
        s1.marks=44;
        Student s2=new Student();
        s2.USN=102;
        s2.name="naveeen";
        s2.marks=90;
        s1.evaluate();
        s2.evaluate();
    }
}

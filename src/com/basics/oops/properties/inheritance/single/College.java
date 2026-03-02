package com.basics.oops.properties.inheritance.single;

public class College {
    static String name="Sapthagiri";
    String address;
    int pincode;

    public College(String address, int pincode) {
        this.address = address;
        this.pincode = pincode;
    }
}
class Department extends College{
    String block;
    int lectureCount;

    public Department(String address, int pincode, String block,int lectureCount) {
        super(address, pincode);
        this.block = block;
        this.lectureCount=lectureCount;
    }
    void display(){
        System.out.println(College.name+" "+address+" "+pincode+" "+block+" "+lectureCount);
    }

    public static void main(String[] args) {
        Department details=new Department("chikkasandra",560073,"A",56);
        details.display();
    }
}
/*
✅super.something-> variable from parent Class
👌super()->constructor of the parent class
❌don't use super.for constructor
these are important for interviews and vivas
 */

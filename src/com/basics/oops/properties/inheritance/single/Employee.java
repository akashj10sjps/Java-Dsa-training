package com.basics.oops.properties.inheritance.single;

public class Employee {
    int id;
    String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Lecturer extends Employee{
    String subject;
    Lecturer(int id,String name,String subject){
        super(id , name);
        this.subject=subject;
    }
    void display(){
        System.out.println(id+" "+name+" "+subject);
    }

    public static void main(String[] args) {
        Lecturer lecture=new Lecturer(20,"akash","maths");
        lecture.display();
    }
}

package com.basics.oops.properties.inheritance.single;

public class Person {
    String name;
    Person(String name){
        this.name=name;
    }
}
class Student extends Person{
    int roleNo;
    Student(int roleNo,String name){
        super(name);
        this.roleNo=roleNo;
    }
    void display(){
        System.out.println(roleNo+" "+name);
    }

    public static void main(String[] args) {
        Student student=new Student(101,"Akash");
        student.display();
    }
}

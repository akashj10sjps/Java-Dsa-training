package com.tripillar_coding_assignment.module3;

public class Student {
    String name;
    int marks;
    void studentDetails(){
        System.out.println("Name of Student is: "+name);
        System.out.println("Marks of student is :"+marks);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="AKash";
        s1.marks=97;
        s1.studentDetails();
    }
}

package com.basics.oops.withConstructor;

public class Student {
    //instance variables
    int USN;
    String name;
    int marks;
    static String college="sapthagiri";
    Student(int USN,String name,int marks){
        this.USN=USN;
        this.name=name;
        this.marks=marks;
    }
    void evaluate(){
        if(marks<45){
            System.out.println(name+" has failed");
        }else{
            System.out.println(name+" is passed");
        }
    }
    void studentDetails(){
        System.out.println(name+"-"+USN+"-"+marks+"-"+college);
    }
    public static void main(String[] args) {
        //object creation syntax: Classname obj=new classroom()
        Student s1=new Student(101,"akash",44);
        Student s2=new Student(102,"naveen",90);
        s1.evaluate();
        s2.evaluate();
        s1.studentDetails();
        s2.studentDetails();
    }
}

package com.basics.oops.properties.inheritance.hybrid;
interface Sports{
    void play();
}
class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}
public class Student extends Person implements Sports{
    Student(String name){
        super(name);
    }
    @Override
    public void play() {
        System.out.println(name+" play cricket");
    }

    public static void main(String[] args) {
        Student student=new Student("Akash");
        student.play();
    }
}


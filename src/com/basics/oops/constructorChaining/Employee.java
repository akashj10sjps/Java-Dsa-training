package com.basics.oops.constructorChaining;

import java.time.temporal.Temporal;

public class Employee {
    int id;
    String name;
    double salary;
    static String company="Microsoft";
    Employee(){
        this(0,"Not assigned",0.0);
    }
    Employee(int id,String name){
        this(id,name,30000);
    }
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary+" "+Employee.company);
    }

    public static void main(String[] args) {
        Employee e1=new Employee();
        Employee e2=new Employee(100,"Akash");
        Employee e3=new Employee(101,"Naveen",40000);
        e1.display();
        e2.display();
        e3.display();
    }

}

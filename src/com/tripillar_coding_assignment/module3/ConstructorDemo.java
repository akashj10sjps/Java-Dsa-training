package com.tripillar_coding_assignment.module3;

public class ConstructorDemo {
    String name;
    String role;
    int Idno;
    int Salary;
    ConstructorDemo(String name,String role,int Idno,int Salary){
        this.name=name;
        this.role=role;
        this.Idno=Idno;
        this.Salary=Salary;
    }
    void employeeDetails(){
        System.out.println("Name of Employee is:"+name);
        System.out.println("Role of Employee is:"+role);
        System.out.println("Idno of Employee is:"+Idno);
        System.out.println("Salary of Employee is:"+Salary);
    }

    public static void main(String[] args) {
        ConstructorDemo employee = new ConstructorDemo("Naveen","Manager",20,200000);
        employee.employeeDetails();
    }
}

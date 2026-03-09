package com.tripillar_coding_assignment.module4;

public class StaticEx {
    static String college="Sapthagiri";
    int usn;
    String name;

    public StaticEx(int usn, String name) {
        this.usn = usn;
        this.name = name;
    }
}
class StaticMethod{
    public static int add(int a,int b){
        return a+b;
    }
}
class StudentDetails extends StaticEx{
    int attendance;
    public StudentDetails(int usn, String name,int attendance) {
        super(usn, name);
        this.attendance=attendance;
    }
    void display(){
        System.out.println(name+" "+usn+" "+attendance+" "+StaticEx.college);
    }

    public static void main(String[] args) {
        StudentDetails s=new StudentDetails(20,"AKash",50);
        s.display();
        //Static method Example : we can use without creating object
        System.out.println(StaticMethod.add(5,4));
    }
}



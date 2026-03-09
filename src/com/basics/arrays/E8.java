package com.basics.arrays;

import java.util.Arrays;

//Arrays of Objects {Students} {Interns} {Books} {Pens} {Bikes}
class Student{
    String name;
    int USN;
}
class Intern{
    String name;
    int id;

    public Intern(String name,int id) {
        this.id = id;
        this.name = name;
    }
}
public class E8 {
    public static void main(String[] args) {
        //int[] arr {1,2,3,4,5}
        Student[] students=new Student[3];
        //{student [0]{},student[1]{},student[2]{}};
        students[0]=new Student();
        students[0].name="Akash";
        students[0].USN=6;
        System.out.println(students[0].name+","+students[0].USN);
        Intern[] interns=new Intern[]{
                new Intern("Akash",40),
                new Intern("allu",76),
                new Intern("bharath",69)
        };
        for(Intern i:interns){
            System.out.println(i.name+" ,"+i.id);
        }
    }
}

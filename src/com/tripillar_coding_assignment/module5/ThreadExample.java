package com.tripillar_coding_assignment.module5;

public class ThreadExample extends Thread{
    String college;
    int usn;
    int time;
    String access;
    public ThreadExample(String college, int usn, int time, String access) {
        this.college = college;
        this.usn = usn;
        this.time = time;
        this.access=access;
    }
    public void run(){
        System.out.println(college+" "+usn+" "+time+" "+access);
    }
}
class collegeentry {
    public static void main(String[] args) {
        ThreadExample s1=new ThreadExample("Sapthagiri",20,8,"Allow");
        ThreadExample s2=new ThreadExample("Sapthagiri",20,9,"Allow");
        ThreadExample s3=new ThreadExample("Sapthagiri",20,11,"Access denied");
        s1.start();
        s2.start();
        s3.start();
    }
}

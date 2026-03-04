package com.basics.threads;

public class ThreadsWithPriority extends Thread{
    public void run(){
        for (int i = 1; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+"|Priority:"
                    +Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        ThreadsWithPriority t1=new ThreadsWithPriority();
        ThreadsWithPriority t2=new ThreadsWithPriority();
        ThreadsWithPriority t3=new ThreadsWithPriority();
        t1.setName("Low priority thread");
        t2.setName("medium priority threads");
        t3.setName("high priority threads");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(11);//illegal argument exception
        t1.start();
        t2.start();
        t3.start();
    }
}
// thread priority is only a suggestion to the jvm or scheduler
//higher priority doesn't guarantee earlier order of execution
//higher priority threads may get more cpu time by the scheduler
//the actual behaviour depends on jvm & operating system


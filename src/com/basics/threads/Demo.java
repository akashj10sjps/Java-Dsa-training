package com.basics.threads;

public class Demo implements Runnable{
    public void run() {

        String threadName = Thread.currentThread().getName();

        for (int i = 1; i <= 2; i++) {
            System.out.println("[" + threadName + "] is counting: " + i);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Demo task=new Demo();

        Thread thread1 = new Thread(task, "T1");
        Thread thread2 = new Thread(task, "T2");

        System.out.println("Starting background workers...");

        // Start both threads concurrently
        thread1.start();
        thread2.start();

    }
}

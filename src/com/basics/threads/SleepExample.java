package com.basics.threads;

public class SleepExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Printing numbers 1 to 5:");
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Printing number:"+i);
            Thread.sleep(1000);
        }
        System.out.println("Successfully Printed 1 to 5");
    }
}
/*
Code explanation
here ,the thread is paused for a fixed duration using sleep()
the thread does not release any lock, and it resumes automatically after
the given time
it will just interrupt the execution of the thread for that time
wait is condition based
sleep is time based
 */
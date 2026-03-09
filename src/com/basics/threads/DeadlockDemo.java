package com.basics.threads;

public class DeadlockDemo {
    static final Object accountA=new Object();
    static final Object accountB=new Object();
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            synchronized (accountA){
                System.out.println("Thread 1 locked account A");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){}
                synchronized (accountB){
                    System.out.println("Thread 1 locked account B");
                }
            }
        });
        Thread t2=new Thread(()->{
            synchronized (accountB){
                System.out.println("Thread 2 locked account B");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){}
                synchronized (accountA){
                    System.out.println("Thread 2 locked account A");
                }
            }
        });
        t1.start();
        t2.start();

    }
}
/*
✅Points to remember
ℹ️Thread 1 acquires a lock on Account A and then sleeps,giving
ℹ️Thread 2 time to acquire a lock on Account B
ℹ️Thread 1 waits for Account A & Thread 2 waits for Account  b
ℹ️ Since neither thread releases the lock,both keep waiting for each other creating a
deadlock situation
Deadlock Explanation:Deadlock occurs when each thread is holding a resource and waiting for the
other thread to release it
ℹ️ when deadlock occurs ,it will not destroy the app,it will freeze it permanently
ℹ️ how to resolve deadlock-> write better code!
 */
package com.basics.threads;

public class ATMTransaction extends Thread{
    public void run(){
        System.out.println("processing ATM Transaction");
    }

    public static void main(String[] args) {
        ATMTransaction tx=new ATMTransaction();
        System.out.println("thread state:"+tx.getState());// new state -> object created
        tx.start();
        System.out.println("thread state:"+tx.getState());// RUNNABLE

    }
}
// initially the thread is in the NEW state
//After calling start() ,it moves to RUNNABLE state ,and it executes the run() methods
//the exact timimg of state change will depend on the JVM scheduler
//points to remember
//thread is created only once
//start() changes the state
//thread cannot be started
//final state is DEAD or terminated
//bullet points for interviews /placements
//a thread can be created by extending the thread class and overriding the run() method
//run() contains the task()
//start() creates a new new thread
//calling run() directly (no multithreading)
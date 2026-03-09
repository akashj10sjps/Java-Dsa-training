package com.tripillar_coding_assignment.module5;


public class SynchronizationExample {
    private static int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws Exception {
        SynchronizationExample c = new SynchronizationExample();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("the final count is :" + c.count);
    }
}

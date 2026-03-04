package com.basics.threads;

public class JoinProof {
     static class Task extends Thread {
         public void run() {
             try {
                 Thread.sleep(2000);
             } catch (Exception e) {}
                 System.out.println("this child task or thread has finished");          }
         }

     public static void main(String[] args) throws Exception{
         Task t = new Task();
         t.start();
         t.join();
         System.out.println("main thread resumes");
     }
}



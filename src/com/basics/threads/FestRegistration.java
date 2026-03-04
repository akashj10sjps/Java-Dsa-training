package com.basics.threads;

public class FestRegistration {
    //form fillup
    static class FormFilling extends Thread{
        public void run(){
            System.out.println("form filling started");
        }
    }
    //upload documents
    static class DocumentUpload extends Thread{
        public void run(){
            System.out.println("Document upload started");
        }
    }
    //email notification
    static class EmailNotification extends Thread{
        public void run(){
            System.out.println("Email notification sent");
        }
    }

    public static void main(String[] args) {
        FormFilling ff=new FormFilling();
        DocumentUpload du=new DocumentUpload();
        EmailNotification en=new EmailNotification();
        ff.start();
        du.start();
        en.start();
    }
}
/*✅start() is used for multitasking
✅java program starts with one main thread
✅throws allow "parallel execution"->concurrency
✅output order is never guaranteed
✅threads share the name memory
✅improves the performance & responsiveness
✅when start() is called ,the jvm creates a new Thread
✅when run() is called directly ,there no concurrency
✅process vs thread
✅thread is path of execution inside the program
✅a process has its own memory
✅threads share the same memory
✅creating a thread is cheaper than creating a process
✅Example:
process -> google Chrome Browser: thread-> new tab in chrome
closing a tab doesn't close chrome
*/

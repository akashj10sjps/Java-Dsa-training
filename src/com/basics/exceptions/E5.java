package com.basics.exceptions;
import java.io.IOException;
public class E5 {
    //Ducking
    static void readFile() throws IOException{
        throw new IOException("tyring to read the file.");
    }
    public static void main(String[] args) {
        try{
            function1();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    static void function1() throws IOException{
        function2();
    }
    static void function2() throws IOException{
        readFile();
    }
}
/*
✅For checked exceptions we always use a try catch block or throws
✅the 'throws' keyword doesn't handle exception
✅it only passes on the information to the calling method
✅the calling method has to handle exception
✅the 'throws' keyword is used in the "method signature"
✅the process of passing on the information is called "ducking"
 */

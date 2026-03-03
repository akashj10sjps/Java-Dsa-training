package com.basics.strings;

public class PerformanceTest {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder("java");//t1
        long startTime=System.currentTimeMillis();
        for (int i = 0; i <10000000 ; i++) {
            builder.append(" Dsa");
        }
        System.out.println("Builder Time:"+(System.currentTimeMillis()-startTime));
        startTime=System.currentTimeMillis();
        StringBuffer buffer=new StringBuffer("java");
        for (int i = 0; i < 10000000; i++) {
            buffer.append(" Dsa");
        }
        System.out.println("Buffer Time:"+(System.currentTimeMillis()-startTime));
    }

}

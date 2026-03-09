package com.tripillar_coding_assignment.module5;

import java.io.IOException;

public class ThrowUsage {
    static void input() throws Exception {
        throw new IOException("Giving input to the file");
    }

    public static void main(String[] args) {
        try {
            function1();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void function1() throws Exception {
        function2();
    }

    static void function2() throws Exception {
        input();
    }
}


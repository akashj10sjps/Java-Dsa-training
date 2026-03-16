package com.basics.methods;

public class StringToInt {
    public static void main(String[] args) {
        String s="-420";
        int result=myAtoi(s);
        System.out.println(result);
    }
        public static int myAtoi(String s) {
            if (s == null) {
                return 0;
            }
            int n = s.length();
            if (n == 0){
                return 0;
            }

            int i = 0;
            // Step 1: Ignore leading whitespaces
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }

            // Handle case where the string only contains whitespaces
            if (i == n){
                return 0;
            }

            // Step 2: Determine the sign
            int sign = 1;
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                i++;
            }

            // Step 3: Convert digits with overflow checking
            long result = 0;
            while (i < n && Character.isDigit(s.charAt(i))) {
                int digit = s.charAt(i) - '0';
                result = result * 10 + digit;

                // Step 4: Check for and handle 32-bit integer overflow
                if (sign * result > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (sign * result < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
                i++;
            }

            return (int) (sign * result);
        }
    }


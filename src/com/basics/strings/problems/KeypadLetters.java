package com.basics.strings.problems;

import java.util.ArrayList;
import java.util.List;

public class KeypadLetters {
    public static void main(String[] args) {
        List<String> result=letterCombinations("23");
        System.out.println(result);

    }
        // Mapping digits to character arrays for faster access
        private static final char[][] KEYPAD = {
                {}, {},
                {'a', 'b', 'c'},      // 2
                {'d', 'e', 'f'},      // 3
                {'g', 'h', 'i'},      // 4
                {'j', 'k', 'l'},      // 5
                {'m', 'n', 'o'},      // 6
                {'p', 'q', 'r', 's'}, // 7
                {'t', 'u', 'v'},      // 8
                {'w', 'x', 'y', 'z'}  // 9
        };
        public static List<String> letterCombinations(String digits) {
            List<String> result=new ArrayList<>();
            if (digits == null || digits.length() == 0) return result;

            // Use a char array to store the current path - extremely memory efficient
            char[] path = new char[digits.length()];
            backtrack(digits, 0, path, result);
            return result;
        }


        private static void backtrack(String digits, int index, char[] path, List<String> result) {
            // Base Case: Path is full
            if (index == digits.length()) {
                result.add(new String(path));
                return;
            }

            // Get letters for current digit
            char[] letters = KEYPAD[digits.charAt(index) - '0'];
            for (char c : letters) {
                path[index] = c; // Overwrite the character at this position
                backtrack(digits, index + 1, path, result);
            }
        }
    }

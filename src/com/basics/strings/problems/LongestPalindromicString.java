package com.basics.strings.problems;

public class LongestPalindromicString {
    public static void main(String[] args) {
        String s="abbaa";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
                // Case 1: Palindrome with odd length (e.g., "aba")
            int len1 = expandFromMiddle(s, i, i);
                // Case 2: Palindrome with even length (e.g., "abba")
            int len2 = expandFromMiddle(s, i, i + 1);

            int len = Math.max(len1, len2);
            if (len > end - start) {
                    // Calculate new start and end positions
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
        }

        private static int expandFromMiddle(String s, int left, int right) {
            if (s == null || left > right) return 0;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            // Return the length of the palindrome found
            return right - left - 1;
        }

}

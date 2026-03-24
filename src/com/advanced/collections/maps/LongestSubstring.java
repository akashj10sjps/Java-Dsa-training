package com.advanced.collections.maps;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        String s="abcbcacbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        // Map to store the last seen index of each character
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If we've seen the character and it's inside our current window
            if (map.containsKey(currentChar)) {
                // Move the left pointer to the right of the previous occurrence
                left = Math.max(left, map.get(currentChar) + 1);
            }

            // Update the last seen position of the character
            map.put(currentChar, right);

            // Calculate current window size and update max
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

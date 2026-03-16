package com.basics.strings.problems;

public class ZigzagString {
    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        String result=convert(s,3);
        System.out.println(result);
    }
        public static String convert(String s, int numRows) {
            // If there is only one row or the string length is less than or equal to numRows, no zigzag conversion is needed.
            if (numRows == 1 || s.length() <= numRows) {
                return s;
            }

            // Create an array of StringBuilder objects, one for each row.
            StringBuilder[] rows = new StringBuilder[numRows];
            for (int i = 0; i < numRows; i++) {
                rows[i] = new StringBuilder();
            }

            int currentRow = 0;
            boolean goingDown = false; // Flag to track the direction of movement (down or up)

            // Iterate through each character in the input string
            for (char c : s.toCharArray()) {
                // Append the current character to the appropriate row's StringBuilder
                rows[currentRow].append(c);

                // Check if we need to change the direction of movement
                if (currentRow == 0 || currentRow == numRows - 1) {
                    goingDown = !goingDown; // Reverse direction at the top and bottom rows
                }

                // Move to the next row based on the current direction
                if (goingDown) {
                    currentRow++;
                } else {
                    currentRow--;
                }
            }

            // Concatenate all the rows to form the final result string
            StringBuilder result = new StringBuilder();
            for (StringBuilder row : rows) {
                result.append(row);
            }

            return result.toString();
        }
}


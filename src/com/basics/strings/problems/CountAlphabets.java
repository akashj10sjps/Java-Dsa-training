package com.basics.strings.problems;
import java.util.Scanner;
public class CountAlphabets {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // hasNextLine() prevents crashes on hidden empty test cases
            if (scanner.hasNextLine()) {
                String inputString = scanner.nextLine();

                int alphabets = 0;
                int digits = 0;
                int specialChars = 0;

                for(char ch:inputString.toCharArray()){

                    if (Character.isLetter(ch)) {
                        alphabets++;
                    } else if (Character.isDigit(ch)) {
                        digits++;
                    } else if (!Character.isWhitespace(ch)) {
                        // This ensures spaces and tabs are NOT counted as special characters
                        specialChars++;
                    }
                }

                // Output matching the expected format exactly
                System.out.println("Alphabets: " + alphabets);
                System.out.println("Digits: " + digits);
                System.out.println("Special Characters: " + specialChars);
            }

            scanner.close();
        }
    }

package assignment_questions;

import java.util.Scanner;

public class string_remove_duplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  // input a string
        System.out.println(removeConsecutiveDuplicates(s));  // Function to remove consecutive duplicates
    }

    // Function to remove consecutive duplicates
    public static String removeConsecutiveDuplicates(String s) {
        // Edge case: if the string is empty, return it as is
        if (s == null || s.length() == 0) {
            return s;
        }

        String result = "";  // Initialize result string

        // Add the first character to the result
        result += s.charAt(0);

        // Loop through the string and check for consecutive duplicates
        for (int i = 1; i < s.length(); i++) {
            // If the current character is different from the previous one, append it to the result
            if (s.charAt(i) != s.charAt(i - 1)) {
                result += s.charAt(i);
            }
        }

        // Return the final result string
        return result;
    }
}

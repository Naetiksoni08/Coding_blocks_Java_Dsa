package assignment_questions;

	import java.util.Scanner;

	public class string_ascii {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();  // input a string
	        System.out.println(insertAsciiDifference(s));  // Function to insert ASCII difference
	    }

	    // Function to insert the ASCII difference between each pair of characters
	    public static String insertAsciiDifference(String s) {
	        // Edge case: if the string is empty or has only one character, return it as is
	        if (s == null || s.length() <= 1) {
	            return s;
	        }

	        String result = "";  // Initialize result string
	        
	        // Add the first character to the result
	        result += s.charAt(0);

	        // Loop through the string and insert the difference between consecutive characters
	        for (int i = 0; i < s.length() - 1; i++) {
	            // Get the ASCII difference between consecutive characters
	            int asciiDifference = s.charAt(i + 1) - s.charAt(i);
	            result += asciiDifference + "" + s.charAt(i + 1);  // Append the difference and the next character
	        }

	        // Return the final result as a string
	        return result;
	    }
	}


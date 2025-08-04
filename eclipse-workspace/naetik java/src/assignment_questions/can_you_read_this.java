package assignment_questions;

import java.util.Scanner;

public class can_you_read_this {

		 public static void main(String[] args) {
		        
			 Scanner sc=new Scanner(System.in);
			 String s = sc.nextLine(); // input as string 
		        
		        // Initialize a temporary string to hold the current word
		        String word = "";
		        
		        // Loop through each character in the string
		        for (int i = 0; i < s.length(); i++) {
		            char ch = s.charAt(i);
		            
		            // If the character is uppercase, print the previous word and start a new word
		            if (Character.isUpperCase(ch)) {
		                if (!word.isEmpty()) {
		                    System.out.println(word);  // Print the previous word
		                }
		                word = String.valueOf(ch);  // Start a new word with the uppercase letter
		            } else {
		                word += ch;  // Add the lowercase letter to the current word
		            }
		        }
		        
		        // Print the last word after the loop ends
		        if (!word.isEmpty()) {
		            System.out.println(word);
		        }
		    }
		}

		 

package assignment_questions;

import java.util.Scanner;

public class string_toggle_class {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String s = sc.nextLine(); // input as string 
		 String result = "";
		 for(int i  = 0 ; i <s.length(); i++ ) {
			  char ch = s.charAt(i);
			  if (Character.isUpperCase(ch)) {
	                // Convert upper case to lower case
	                ch = Character.toLowerCase(ch);
	            } 
			  else if (Character.isLowerCase(ch)) {
	                // Convert lower case to upper case
	                ch = Character.toUpperCase(ch);
	            }
			  result = result+ch;
			  
			  
		 }
		 System.out.println(result);
		
		
 	

	}
	
		
	}



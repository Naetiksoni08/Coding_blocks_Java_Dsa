package assignment_questions;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();  // input a string
	        System.out.println(duplicate(s));

	}
	public static String duplicate(String s) {
		if(s == null || s.length() == 0) {
			return s;
		}
	    String result = "";
	    result = result + s.charAt(0);
	    for(int i = 1 ; i <s.length(); i++) {
			if(s.charAt(i) != s.charAt(i-1)) {
				result = result+s.charAt(i);
			}
		}
	    return result;
		
	}
	
	

}

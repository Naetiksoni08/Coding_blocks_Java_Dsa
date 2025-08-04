package assignment_questions;

import java.util.Scanner;

public class string_palidrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 String s = sc.nextLine();  // input a string
		 palindrome(s);

	}
	
	public static boolean ispalindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		while(i<=j) {
			if(s.charAt(i) != s.charAt(j)) {
				
			return false;
		}
		i++;
		j--;
	}
	return true;

	}
	public static void palindrome(String s) {
		int count = 0;
		for(int i = 0 ; i <s.length(); i++) {
			for(int j = i+1; j<=s.length(); j++) {
				String str = s.substring(i, j);//method
				if(ispalindrome(str)) { //  calling the above function 
					count++;
				}
				
			}
		}
		System.out.println(count);
	}
	

}

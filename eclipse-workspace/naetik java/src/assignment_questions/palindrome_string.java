package assignment_questions;

import java.util.Scanner;

public class palindrome_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.next(); 
		System.out.println(palindrome(s)+ " ");
		
	}
	public static boolean palindrome (String s) {
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

}

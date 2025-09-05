package assignment_questions;

import java.util.Scanner;

public class String_odd_even_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(odd_even(str));

	}

	public static String odd_even(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length() ; i++) {
			char ch = str.charAt(i);

			if (i % 2 == 0) { // even hai
				sb.append((char) (ch + 1)); // if we dont do the typecaste part then actual value will get append that is 98 

			} else {
				sb.append((char) (ch - 1));

			}
		}
		return sb.toString();
	}

}

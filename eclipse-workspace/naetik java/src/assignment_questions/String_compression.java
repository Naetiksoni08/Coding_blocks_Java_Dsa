package assignment_questions;

import java.util.Scanner;

public class String_compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(compression(str));

	}
	public static String compression(String str) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				count++;
			}else {
				sb.append(str.charAt(i-1)).append(count);
				count = 1;
			}
			
		}
		sb.append(str.charAt(str.length()-1)).append(count); // sb ke andar append kardo str.charat ka i-1 character and uske andar append kardo count
		return sb.toString();
	}


}


//str.charAt(str.length()-1) → string ka last character lo.
//Example "aaabbccdsaa" → last character 'a'.
//.append(count) → uss last character ka final count add karo.
//Loop khatam hone ke baad count = 2, so "a2".

package assignment_questions;

import java.util.Scanner;

public class String_String_compression {

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
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				sb.append(str.charAt(i - 1));
				if (count > 1) {
					sb.append(count);
				}
				count = 1;
			}

		}
		sb.append(str.charAt(str.length() - 1));
		if (count > 1) {
			sb.append(count);
		}
		return sb.toString();

	}

}
//so basically flow kya hoga
// loop chala 1 sai check karega ki kya i-1 aur i yani a a match karte hai yes toh count ++ so count = 2 hogaya 
// then again i = 2 mai kya i-1 aur i match karte hai toh count++ so count = 3 hogaya then again 
// i  = 3 kya b aur a match karte hai no toh if nai chalega else mai gaye bola ki sb mai append kardo i-1 yani a ko aur if chalega bolega ki kya count ki value is greater than 1 yes it is 3 so append kardo sb mai toh humare pass aah gaya a3 
// and last group ke liye simple hai ki d par aaye bola ki kya d aur c match karte hai false if nai chalega then bolega ki kya count ki value is greater than 1 bolega no it is 1 only fir niche ayega bolega ki sb ke anadar append kardo d ko aur fir check karega ki kya count ki value is greater than 1 bolega no so count append nai hoga that is d aah jayega sirf same for s 

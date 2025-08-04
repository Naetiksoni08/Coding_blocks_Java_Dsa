package assignment_questions;

import java.util.Scanner;

public class ultra_fast_maths_recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			String str1 = sc.next();
			String Str2 = sc.next();
			System.out.println(mathematic(str1, Str2, "", 0));
			t--;

		}
		

	}

	public static String mathematic(String str1, String str2, String ans, int index) {
		if (index == str1.length() || index == str2.length()) {
			return ans;

		}

		if (str1.charAt(index) == str2.charAt(index)) {
			ans += "0";

		} else {
			ans += "1";

		}
		return mathematic(str1, str2, ans, index + 1);

	}

}

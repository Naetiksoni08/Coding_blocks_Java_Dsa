package assignment_questions;

import java.util.Scanner;

public class replace_all_pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // no of lines
		sc.nextLine(); // string per line
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();
			System.out.println(replacepi(str));
		}

	}

	public static String replacepi(String str) {
		if (str.length() == 0) {
			return str;
		}

		if (str.startsWith("pi")) {
			return "3.14" + replacepi(str.substring(2));
		} else {
			return str.charAt(0) + replacepi(str.substring(1));
		}

	}
}

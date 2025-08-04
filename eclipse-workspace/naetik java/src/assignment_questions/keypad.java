package assignment_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class keypad {

	static String[] keyboard = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans = "";

		keypad(str, "");
		System.out.println();
		System.out.println(count);

	}

	static int count = 0;

	public static void keypad(String str, String ans) {
		if (str.length() == 0) {

			System.out.print(ans + " ");
			count++;
			return;

		}
		char ch = str.charAt(0);
		int num = ch - '0';
		String press = keyboard[num-1];
		for (int i = 0; i < press.length(); i++) {
			keypad(str.substring(1), ans + press.charAt(i));
		}
	}

}

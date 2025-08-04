package recursion_backtracking_bitmasking_practice;

import java.util.*;

public class letter_combination_of_a_phone_number {

	static String[] keyboard = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		String str = "23";
		String ans = "";
		List<String> ll = new ArrayList<>();
		keypad(str, "", ll);
		System.out.println(ll);
		System.out.println(count);

	}
    static int count = 0;
	public static void keypad(String str, String ans, List<String> ll) {
		if (str.length() == 0) {
			ll.add(ans);
//			System.out.println(ans);
			count++;
			return;
		
		}
		char ch = str.charAt(0);
		int num = ch - '0';
		String press = keyboard[num];
		for (int i = 0; i < press.length(); i++) {
			keypad(str.substring(1), ans + press.charAt(i), ll);
		}
	}

}

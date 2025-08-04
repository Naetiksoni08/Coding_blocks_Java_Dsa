package recursion3;
import java.util.*;

public class keypad_leetcode {

	static String[] keyboard = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		String str = "23";
		List<String> ll = new ArrayList<>();
		keypad(str, "", ll);
		System.out.println(ll);

	}

	public static void keypad(String ques, String ans, List<String> ll) {
		if (ques.isEmpty()) {
			ll.add(ans);
			return;

		}
		char ch = ques.charAt(0);
		// 0 ascii value is 48
		// converting the number
		int idx = ch - '0'; // ascii value aise nikal te h
		String press = keyboard[idx];
		for (int i = 0; i < press.length(); i++) {
			keypad(ques.substring(1), ans + press.charAt(i), ll);

		}

		// letter combination of a phone number

	}

}

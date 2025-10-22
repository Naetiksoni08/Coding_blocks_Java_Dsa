package blind_45_days_sheet;

import java.util.*;

public class Letter_combination_of_phone_number_leetcode {

	static String[] keyboard = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		String ques = "23";
		List<String> ll = new ArrayList<>();
		Combination(ques, "",ll);
		System.out.println(ll);
	}

	public static void Combination(String ques, String ans, List<String> ll) {
		if (ques.length() == 0) {
			ll.add(ans);
			return;
		}
		char ch = ques.charAt(0);
		int num = ch - '0';
		String press = keyboard[num];
		for (int i = 0; i < press.length(); i++) {
			Combination(ques.substring(1), ans + press.charAt(i),ll); // substring becuase 3,aw we will pass or 93,a
		}

	}
}

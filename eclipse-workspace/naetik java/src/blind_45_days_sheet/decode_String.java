package blind_45_days_sheet;

import java.util.*;

public class decode_String {

	public static void main(String[] args) {
		String s = "3[a]2[bc]";
		Stack<String> character = new Stack<>();
		Stack<Integer> number = new Stack<>();
		StringBuilder currstr = new StringBuilder();
		int num = 0;
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
				num = num * 10 + (c - '0'); // c='3' '3' = 51 and '0' = 48 = 51-48 = 3 done 
			} else if (c == '[') {
				character.push(currstr.toString());
				number.push(num);
				currstr.setLength(0);
				num = 0;
			} else if (c == ']') {
				int k = number.pop();
				String prev = character.pop();
				StringBuilder sb = new StringBuilder(currstr.length() * k);
				for (int i = 0; i < k; i++) {
					sb.append(currstr);
				}
				String finalstr = sb.toString();
				currstr = new StringBuilder(prev+finalstr);
			} else {
				currstr.append(c);
			}
		}
		System.out.println(currstr.toString());
	}

}

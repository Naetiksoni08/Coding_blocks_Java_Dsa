package blind_45_days_sheet;

import java.util.*;

public class password_strength {

	public static void main(String[] args) {
		String password = "aA1!";
		int sum = 0;
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if (!set.contains(ch)) {
				set.add(ch);
				if (Character.isLowerCase(ch)) {
					sum += 1;
				} else if (Character.isUpperCase(ch)) {
					sum += 2;
				} else if (Character.isDigit(ch)) {
					sum += 3;
				} else {
					sum += 5;
				}

			}

		}

		System.out.println(sum);
	}
}

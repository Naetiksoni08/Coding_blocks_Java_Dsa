package blind_45_days_sheet;

import java.util.HashSet;

public class count_the_number_of_special_character_1 {

	public static void main(String[] args) {
		String word = "aaAbcBC";
		HashSet<Character> lowerset = new HashSet<>();
		HashSet<Character> upperset = new HashSet<>();
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isLowerCase(ch)) {
				lowerset.add(ch);
			} else {
				upperset.add(ch);
			}
		}
		int count = 0;
		for (char ch : lowerset) {
			if (upperset.contains(Character.toUpperCase(ch))) {
				count++;
			}
		}
		System.out.println(count);
	}

}

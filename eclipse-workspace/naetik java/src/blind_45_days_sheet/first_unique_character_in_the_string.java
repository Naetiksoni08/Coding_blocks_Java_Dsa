package blind_45_days_sheet;

import java.util.*;

public class first_unique_character_in_the_string {

	public static void main(String[] args) {
		String str = "Leetcode";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
				map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) == 1) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

}

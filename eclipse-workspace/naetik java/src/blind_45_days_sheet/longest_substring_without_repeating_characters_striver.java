package blind_45_days_sheet;

import java.util.*;

public class longest_substring_without_repeating_characters_striver {
	public static void main(String[] args) {
		String s = "abcabcbb";
		int si = 0;
		int ei = 0;
		int maxlen = 0;
		HashSet<Character> set = new HashSet<>();

		while (ei < s.length()) {
			char ch = s.charAt(ei); // a mila
			if (!set.contains(ch)) { // mtlb a is unique add it
				set.add(ch);
				maxlen = Math.max(maxlen, ei - si + 1);
				ei++;
			} else { // duplicate character
				set.remove(s.charAt(ch));
				si++;
			}
		}
		System.out.println(maxlen);

	}

}

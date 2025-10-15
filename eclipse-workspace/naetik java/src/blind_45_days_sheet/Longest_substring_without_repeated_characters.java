package blind_45_days_sheet;

import java.util.*;

public class Longest_substring_without_repeated_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcbb";

		System.out.println(longestsubstring(str));
	}

	public static int longestsubstring(String str) {
		int si = 0;
		int ei = 0;
		int maxlen = 0;

		HashSet<Character> set = new HashSet<>();

		while (ei < str.length()) {

			char ch = str.charAt(ei);

			if (!set.contains(ch)) {
				set.add(ch);
				maxlen = Math.max(maxlen, ei - si + 1);
				ei++;

			} else {
				set.remove(str.charAt(si));
				si++;

			}

		}
		return maxlen;
	}

}

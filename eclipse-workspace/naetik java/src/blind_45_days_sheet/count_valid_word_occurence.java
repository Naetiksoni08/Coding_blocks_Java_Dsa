package blind_45_days_sheet;

import java.util.*;

public class count_valid_word_occurence {

	public static void main(String[] args) {
		String[] chunks = { "hello wor", "ld hello" };
		String[] queries = { "hello", "world", "war" };
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < chunks.length; i++) {
			sb.append(chunks[i]);
		}
		String s = sb.toString();

		StringBuilder word = new StringBuilder();
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetter(ch)) {
				word.append(ch);
			} else if (ch == ' ') {
				if (word.length() > 0) {
					String w = word.toString();
					map.put(w, map.getOrDefault(w, 0) + 1);
					word.setLength(0);
				}

			} else if (ch == '-') {
				if (i != 0 && i != s.length() - 1) {
					if (Character.isLetter(s.charAt(i - 1)) && Character.isLetter(s.charAt(i + 1))) {
						word.append(ch);
					} else {
						if (word.length() > 0) {
							String w = word.toString();
							map.put(w, map.getOrDefault(w, 0) + 1);
							word.setLength(0);
						}
					}
				} else {
					if (word.length() > 0) {
						String w = word.toString();
						map.put(w, map.getOrDefault(w, 0) + 1);
						word.setLength(0);
					}

				}
			}
		}
		if (word.length() > 0) {
			String w = word.toString();
			map.put(w, map.getOrDefault(w, 0) + 1);
		}
		int[] ans = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			ans[i] = map.getOrDefault(queries[i], 0);
		}
		System.out.println(Arrays.toString(ans));

	}

}

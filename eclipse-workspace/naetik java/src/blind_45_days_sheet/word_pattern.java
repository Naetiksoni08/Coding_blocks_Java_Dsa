package blind_45_days_sheet;

import java.util.*;

public class word_pattern {

	public static void main(String[] args) {
		String pattern = "abba";
		String word = "dog cat cat dog";
		String[] allword = word.split(" ");
		HashMap<Character, String> map = new HashMap<>();
		HashSet<String> set = new HashSet<>();
		if (pattern.length() != allword.length) {
			System.out.println(false);
			return;
		}
		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);
			String currWord = allword[i];

			if (map.containsKey(ch)) {
				if (!map.get(ch).equals(currWord)) {
					System.out.println(false);
					return;
				}
			} else {
				if (set.contains(currWord)) {
					System.out.println(false);
					return;
				}
				map.put(ch, currWord);
				set.add(currWord);

			}

		}
		System.out.println(true);
	}
//what does set do here current word already kisi nai lia hai ya nai lia voh check karta hai na agar liya toh fir false return agar nai lia toh fir set and map mai entry karo
}

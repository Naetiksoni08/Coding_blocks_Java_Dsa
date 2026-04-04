package blind_45_days_sheet;

import java.util.*;

public class uncommon_words_from_two_sentences {
	public static void main(String[] args) {
		String s1 = "this apple is sweet";
		String s2 = "this apple is sour";
		HashMap<String, Integer> map = new HashMap<>();
		for (String word : s1.split(" ")) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		for (String word : s2.split(" ")) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		List<String> result = new ArrayList<>();
		for (String word : map.keySet()) {
			if (map.get(word) == 1) {
				result.add(word);
			}
		}
		System.out.println(result.toArray(new String[0])); // this means that list ko string ke type ka array banao if
															// sirf toarray karte toh voh object[] return karta
	}

}

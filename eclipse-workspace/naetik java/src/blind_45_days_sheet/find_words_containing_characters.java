package blind_45_days_sheet;

import java.util.*;

public class find_words_containing_characters {

	public static void main(String[] args) {
		List<Integer> result = new ArrayList<>();
		String[] words = { "leet", "code" };
		char c = 'x';
		for (int i = 0; i < words.length; i++) {
			if (words[i].contains(String.valueOf(c))) {
				result.add(i);
			}

		}
		System.out.println(result);
	}

}

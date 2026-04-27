package blind_45_days_sheet;

import java.util.*;

public class ransom_note {
	public static void main(String[] args) {
		String ransomnote = "aa";
		String magazine = "aab";
		int[] freq = new int[26];
		for (char a : magazine.toCharArray()) {
			freq[a - 'a']++;
		}
		for (char c : ransomnote.toCharArray()) {
			freq[c - 'a']--;
			if (freq[c - 'a'] < 0) // if this works then that means ki bhai joh magazine hai usmai itne enough character  
				System.out.println(false);
		}
		System.out.println(true);

	}

}

package blind_45_days_sheet;

import java.util.*;

public class valid_anagram {
//	class Solution {
//		public boolean isAnagram(String s, String t) {
//			Map<Character, Integer> smap = new HashMap<>();
//			Map<Character, Integer> tmap = new HashMap<>();
//			if (s.length() != t.length()) {
//				return false;
//			}
//			for (int i = 0; i < s.length(); i++) {
//				if (!smap.containsKey(s.charAt(i))) {
//					smap.put(s.charAt(i), 1);
//				} else {
//					smap.put(s.charAt(i), smap.get(s.charAt(i)) + 1);
//				}
//			}
//			for (int i = 0; i < t.length(); i++) {
//				if (!tmap.containsKey(t.charAt(i))) {
//					tmap.put(t.charAt(i), 1);
//				} else {
//					tmap.put(t.charAt(i), tmap.get(t.charAt(i)) + 1);
//				}
//				return smap.equals(tmap);
//			}
//			return false;
//
//		}
//	}

	class Solution {
		public boolean isAnagram(String s, String t) {
			Map<Character, Integer> smap = new HashMap<>();
			Map<Character, Integer> tmap = new HashMap<>();
			if (s.length() != t.length()) {
				return false;
			}
			for (char ch : s.toCharArray()) {
				if (!smap.containsKey(ch)) {
					smap.put(ch, 1);
				} else {
					smap.put(ch, smap.get(ch) + 1);
				}
			}
			for (char ch : t.toCharArray()) {
				if (!tmap.containsKey(ch)) {
					tmap.put(ch, 1);
				} else {
					tmap.put(ch, tmap.get(ch) + 1);
				}
			}
			return smap.equals(tmap);

		}
	}

} // order of n

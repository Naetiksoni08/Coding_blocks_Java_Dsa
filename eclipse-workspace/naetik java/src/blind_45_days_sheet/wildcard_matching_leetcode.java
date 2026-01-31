package blind_45_days_sheet;

public class wildcard_matching_leetcode {

	class Solution {
		public boolean isMatch(String s, String p) {
			return wildcard(p, s, 0, 0);
		}

		public static boolean wildcard(String p, String s, int i, int j) {
			if (i == s.length() && j == p.length()) {
				return true;
			}
			if (j == p.length()) {
				return false;
			}
			if (i < s.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?')) {
				return wildcard(p, s, i + 1, j + 1);
			}

			if (p.charAt(j) == '*') {
				// 2 choices
				// 1- string hi empty ho
				// 2 - * sirf ek hi character ko leh of s
				return wildcard(p, s, i, j + 1) || (i < s.length() && wildcard(p, s, i + 1, j));
			}
			return false;

		} // ya toh asterisk 0 khayega ya fir zayda character khayega toh choice hai uske
			// pass toh agar 0 khata hai toh p aage bad jayega thats why j+1 aur i as it
			// is.. then agar voh zada khata hai toh string toh aage bad jayegi but j wahi
			// rahega kyuki * aur bhi kha sakta hai
	}

}

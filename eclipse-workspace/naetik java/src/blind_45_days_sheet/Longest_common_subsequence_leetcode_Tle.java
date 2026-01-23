package blind_45_days_sheet;

public class Longest_common_subsequence_leetcode_Tle {
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "ace";
		System.out.println(lcs(s1, s2, 0, 0));
	}

	// i is for s1
	// j is for s2
	public static int lcs(String s1, String s2, int i, int j) {
		if (i == s1.length() || j == s2.length()) {
			return 0;
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = 1 + lcs(s1, s2, i + 1, j + 1);
		} else {
			int f = lcs(s1, s2, i + 1, j);
			int s = lcs(s1, s2, i, j + 1);
			ans = Math.max(f, s);
		}
		return ans;
	}

}

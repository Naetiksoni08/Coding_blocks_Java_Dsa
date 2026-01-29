package blind_45_days_sheet;

import java.util.*;

public class wordbreak_leetcode {
	public static void main(String[] args) {
		String s = "leetcode";
		List<String> wordDict = new ArrayList<>();
		wordDict.add("leet");
	    wordDict.add("code");
		int[] dp = new int[s.length()];
		Arrays.fill(dp, -1);
		System.out.println(wordbreak(s, wordDict, 0, dp));
	}

	public static boolean wordbreak(String s, List<String> wordDict, int i, int[] dp) {
		if (i == s.length()) {
			return true;
		}
		if (dp[i] != -1) {
			return dp[i] == 1;
		}

		for (String word : wordDict) {
			int len = word.length();

			if (i + len <= s.length() && s.substring(i, i + len).equals(word)) { // i+len<=s.length taki i+len excced
																					// na kar jaye string ki length ko
				if (wordbreak(s, wordDict, i + len, dp)) {
					dp[i] = 1; // true
					return true;
				}
			}
		}
		dp[i] = 0; // false
		return false;
	}

}

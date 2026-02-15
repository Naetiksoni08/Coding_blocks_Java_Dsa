package blind_45_days_sheet;

public class Longest_almost_palindromic_substring {

	public static void main(String[] args) {
		String str = "abca";
		Boolean[][][] dp = new Boolean[str.length()][str.length()][2];
		System.out.println(checkSubstring(str, dp));
	}

	public static boolean almostpalindromic(String s, int i, int j, int chance, Boolean[][][] dp) {
		if (i >= j) {
			return true;
		}
		if (dp[i][j][chance] != null) {
			return dp[i][j][chance];
		}
		if (s.charAt(i) == s.charAt(j)) {
			dp[i][j][chance] = almostpalindromic(s, i + 1, j - 1, chance, dp);
			return dp[i][j][chance];
		} else if (s.charAt(i) != s.charAt(j)) {
			if (chance == 0) {
				dp[i][j][chance] = false;
				return false;
		}
			boolean first = almostpalindromic(s, i + 1, j, chance - 1, dp);
			boolean second = almostpalindromic(s, i, j - 1, chance - 1, dp);
			dp[i][j][chance] = first || second;
			return dp[i][j][chance];
		}

		return false;

	}

	public static int checkSubstring(String s, Boolean[][][] dp) {
		int length = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (almostpalindromic(s, i, j, 1, dp)) {
					length = Math.max(length, j - i + 1);
				}
			}

		}

		return length;
	}
} // this gives TLE need to fix it 

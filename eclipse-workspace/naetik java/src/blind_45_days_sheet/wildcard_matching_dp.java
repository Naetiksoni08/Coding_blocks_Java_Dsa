package blind_45_days_sheet;

public class wildcard_matching_dp {
	public static void main(String[] args) {
		String p = "a";
		String s = "aa";
		Boolean[][] dp = new Boolean[s.length() + 1][p.length() + 1];
		System.out.println(wildcard(p, s, 0, 0, dp));
	}

	// i -- s
	// j -- p
	public static boolean wildcard(String p, String s, int i, int j, Boolean[][] dp) {
		if (dp[i][j] != null) {
			return dp[i][j];
		}
		if (i == s.length() && j == p.length()) {
			return dp[i][j] = true;
		}
		if (j == p.length()) {
			return dp[i][j] = false;
		}
		boolean ans = false;
		if (i < s.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?')) {
			ans = wildcard(p, s, i + 1, j + 1, dp);
		} else if (p.charAt(j) == '*') {
			// 2 choices
			// 1- string hi empty ho
			// 2 - * sirf ek hi character ko leh of s
			ans = wildcard(p, s, i, j + 1, dp) || (i < s.length() && wildcard(p, s, i + 1, j, dp));

		}
		dp[i][j] = ans;
		return ans;

	}

}

package blind_45_days_sheet;

public class distinct_subsequence_bottom_up {

	public static void main(String[] args) {
		String s = "rabbbit";
		String t = "rabbit";
		System.out.println(distinct(s, t));
	}

	public static int distinct(String s, String t) { // amount - i coin -j
		int[][] dp = new int[s.length() + 1][t.length() + 1];
		for (int i = 0; i <=s.length(); i++) {
			dp[i][0] = 1;
		}
		for (int i = 1; i < dp.length; i++) { // amount
			for (int j = 1; j < dp[0].length; j++) {
				int inc = 0, exc = 0;
				if (s.charAt(i - 1) == t.charAt(j-1)) {
					inc = dp[i - 1][j - 1];
				}
				exc = dp[i-1][j];
				dp[i][j] = inc + exc;
			}

		}
		return dp[dp.length - 1][dp[0].length - 1];
	}

}

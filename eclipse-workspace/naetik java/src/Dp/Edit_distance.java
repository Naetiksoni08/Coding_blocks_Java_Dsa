package Dp;

import java.util.Arrays;

public class Edit_distance {

	public static void main(String[] args) {

		String s = "FOOD";
		String t = "MONEY";
		int[][] dp = new int[s.length()][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(distancetopdown(s, t, 0, 0, dp));
	}

	// s ==> i
	// t ==> j
	public static int distance(String s, String t, int i, int j) { // why i and j becuase we have to reduce the string
																	// so we are mainting a index for each string
		if (i == s.length()) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = distance(s, t, i + 1, j + 1);

		} else {
			int delete = distance(s, t, i + 1, j); // ood,money
			int insert = distance(s, t, i, j + 1); // food,oney
			int replace = distance(s, t, i + 1, j + 1); // ood,oney
			ans = 1 + Math.min(delete, Math.min(insert, replace));
		}
		return ans;
	}

	public static int distancetopdown(String s, String t, int i, int j, int[][] dp) {

		if (i == s.length()) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = distancetopdown(s, t, i + 1, j + 1, dp);

		} else {
			int delete = distancetopdown(s, t, i + 1, j, dp); // ood,money
			int insert = distancetopdown(s, t, i, j + 1, dp); // food,oney
			int replace = distancetopdown(s, t, i + 1, j + 1, dp); // ood,oney
			ans = 1 + Math.min(delete, Math.min(insert, replace));
		}
		return dp[i][j] = ans;
	}

} 
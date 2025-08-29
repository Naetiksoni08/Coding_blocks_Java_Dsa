package Dp;

import java.util.Arrays;

public class Longest_common_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "ace";
		int[][] dp = new int[s1.length()][s2.length()];
//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp.length; j++) {
//				dp[i][j] = -1;
//			}
//		}
		for (int[] a : dp) { // basically 2d is the collection of arrays so there will one array in which the
								// address of the other arrays will be sotred so if we apply for each to that
								// array then we will get the index of the other arrays and then we can fill -1
								// on each of them
			Arrays.fill(a, -1);
		}
//		System.out.println(subsequence(s1, s2, 0, 0));
//		System.out.println(subsequencetopdown(s1, s2, 0, 0, dp));
		System.out.println(subsequencebottomup(s1, s2));
 
	}

	// i is for s1
	// j is for s2
	public static int subsequence(String s1, String s2, int i, int j) {
		if (i == s1.length() || j == s2.length()) {
			return 0;
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = 1 + subsequence(s1, s2, i + 1, j + 1);
		} else { // if not matched
			int firstdelete = subsequence(s1, s2, i + 1, j); // first string reduced
			int seconddelete = subsequence(s1, s2, i, j + 1); // second sting reduces
			ans = Math.max(firstdelete, seconddelete);
		}
		return ans;
	}

	public static int subsequencetopdown(String s1, String s2, int i, int j, int[][] dp) {
		if (i == s1.length() || j == s2.length()) {
			return 0;
		}
		if (dp[i][j] != -1) { // why not 0 becuase in the contraints it was guven that 0 can be the value of
								// the string so -1 can never be a value of string
			return dp[i][j];
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = 1 + subsequencetopdown(s1, s2, i + 1, j + 1, dp);
		} else { // if not matched
			int firstdelete = subsequencetopdown(s1, s2, i + 1, j, dp); // first string reduced
			int seconddelete = subsequencetopdown(s1, s2, i, j + 1, dp); // second sting reduces
			ans = Math.max(firstdelete, seconddelete);
		}
		return dp[i][j] = ans;
	}

	public static int subsequencebottomup(String s1, String s2) {
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else { // if not matched
					int firstdelete = dp[i - 1][j]; // first string reduced
					int seconddelete = dp[i][j - 1]; // second sting reduces
					dp[i][j] = Math.max(firstdelete, seconddelete);
				}

			}

		}
		return dp[dp.length-1][dp[0].length-1];
	}

}

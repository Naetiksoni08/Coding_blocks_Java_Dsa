package dynamic_programming;

import java.util.Arrays;

public class longest_common_seubsequence {

	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "ace";
		int[][] dp = new int[str1.length()][str2.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(longest_common(str1, str2, 0, 0));
		System.out.println(longest_commontopdown(str1, str2, 0, 0, dp));

	}

	public static int longest_common(String str1, String str2, int i, int j) {
		if (i == str1.length() || j == str2.length()) {
			return 0;
		}
		int ans = 0;
		if (str1.charAt(i) == str2.charAt(j)) {
			ans = 1 + longest_common(str1, str2, i + 1, j + 1);

		} else {
			int s1 = longest_common(str1, str2, i + 1, j);
			int s2 = longest_common(str1, str2, i, j + 1);
			ans = Math.max(s1, s2);
		}

		return ans;
	}

	public static int longest_commontopdown(String str1, String str2, int i, int j, int[][] dp) {
		if (i == str1.length() || j == str2.length()) {
			return 0;
		}
		if (dp[i][j] != 0) {
			return dp[i][j];
		}
		int ans = 0;
		if (str1.charAt(i) == str2.charAt(j)) {
			ans = 1 + longest_common(str1, str2, i + 1, j + 1);

		} else {
			int s1 = longest_commontopdown(str1, str2, i + 1, j, dp);
			int s2 = longest_commontopdown(str1, str2, i, j + 1, dp);
			ans = Math.max(s1, s2);
		}

		return dp[i][j] = ans;
	}

	public static int longest_commonbuttomup(String str1, String str2) {
		int[][] dp = new int[str1.length()+1][str2.length()+1];
		for (int i = 1; i < dp.length; i++) {
			for(int j = 1;j<dp[0].length;j++) {
					int ans = 0;
					if (str1.charAt(i-1) == str2.charAt(j-1)) {
						dp[i][j]= 1+dp[i-1][j-1];
					} else {
						int s1 = dp[i-1][j];
						int s2 =  dp[i][j-1];
						dp[i][j] = Math.max(s1, s2);
					}
					
				}
			}
		return dp[dp.length-1][dp[0].length-1];

		}

	}


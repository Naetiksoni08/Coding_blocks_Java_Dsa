package assignment_questions;

import java.util.*;

public class Length_of_lcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int[][] dp = new int[s1.length()][s2.length()];
		for(int []arr:dp) {
			Arrays.fill(arr, -1);
		}
		System.out.println(lcs(s1, s2, 0, 0, dp));

	}

//	i-s1
//	j-s2
	public static int lcs(String s1, String s2, int i, int j, int[][] dp) {
		if (i == s1.length() || j == s2.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = 1 + lcs(s1, s2, i + 1, j + 1, dp);
		} else {
			int fst_string = lcs(s1, s2, i + 1, j, dp);
			int sec_string = lcs(s1, s2, i, j + 1, dp);
			ans = Math.max(fst_string, sec_string);
		}
		return dp[i][j] = ans;

	}

}

//we are not gonna use substring in built method in java in this question cuz
// due to that method the time complexity increases so as we have to decrease
// the string in runtime we will pass index like we do to reduce the array

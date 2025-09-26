package assignment_questions;

import java.util.*;

public class LCS_with_3_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		int[][][]dp = new int[s1.length()+1][s2.length()+1][s3.length()+1];
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				Arrays.fill(dp[i][j], -1);
			}
		}
		
		System.out.println(LCS(s1, s2, s3, 0, 0, 0,dp));

	}

	// i--s1
	// j--s2
	// k--s3
	public static int LCS(String s1, String s2, String s3, int i, int j, int k,int[][][]dp) {
		if (i == s1.length() || j == s2.length() || k == s3.length()) {
			return 0;
		}
		if(dp[i][j][k]!=-1) {
			return dp[i][j][k];
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j) && s2.charAt(j) == s3.charAt(k)) {
			ans = 1 + LCS(s1, s2, s3, i + 1, j + 1, k + 1,dp);

		} else {
			int first = LCS(s1, s2, s3, i + 1, j, k,dp);
			int second = LCS(s1, s2, s3, i, j + 1, k,dp);
			int third = LCS(s1, s2, s3, i, j, k + 1,dp);
			ans = Math.max(first, Math.max(second, third));
		}
		return dp[i][j][k]=ans;

	}

}

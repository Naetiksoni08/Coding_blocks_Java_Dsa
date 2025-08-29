package Dp;

import java.util.Arrays;

public class distinct_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";
		String t = "rabbit";
		int[][] dp = new int[s.length()+1][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(distinct(s, t, 0, 0, dp));

	}

//	i for s it will behave like coin
// j for t it will behave like amount
	public static int distinct(String s, String t, int i, int j, int[][] dp) {
		if (j == t.length()) { // if amount zero hogaya toh return 1 or if t wali string 0 hogai toh return 1
			return 1;
		}
		if (i == s.length()) { // if coin hi khali hogaya toh return 0 or if string ki khatam toh return 0
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int inc = 0, exc = 0;
		if (s.charAt(i) == t.charAt(j)) { // call tabhi lagega jab character match karega or coin match karega
			inc = distinct(s, t, i + 1, j + 1, dp); // because infinite supply nai hai off character or coin
		}
		exc = distinct(s, t, i + 1, j, dp); // if it doesnt not match then coin or character aage badega aur amount ya
											// fir t wali string voh same hi rahegi
		return dp[i][j] = inc + exc;

	}

}

package dynamic_programming;

import java.util.Arrays;

public class knap_sack_problem { // zero one

	public static void main(String[] args) {
		int cap = 4;
		int[] wt = { 1, 2, 3, 2, 2 };
		int[] val = { 8, 4, 0, 5, 3 };
		int[][] dp = new int[wt.length+ 1][val.length + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(knap_sack_problem(wt, val, cap, 0,dp));

	}
	
	public static int knap_sack_problem(int[] wt, int[] val, int cap, int i,int[][]dp) {
		if(cap==0 ||i==wt.length) {
			return 0;
		}
		if (dp[cap][i] != -1) {
			return dp[cap][i];
		}
		int inc = 0;
		int exc = 0;
		if (cap >= wt[i]) {
			inc = val[i] + knap_sack_problem(wt, val, cap - wt[i], i + 1,dp);

		}
		exc = knap_sack_problem(wt, val, cap, i + 1,dp);
		return dp[cap][i] = Math.max(inc, exc);

	}

}

package dynamic_programming;

import java.util.Arrays;

public class distinct_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit"; // coin --i
		String t = "rabbit"; // amount --j
		int[][] dp = new int[s.length()][t.length() + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(distinct_subsequencetopdown(s,t,0,0,dp));
	
	}
	public static int distinct_subsequencetopdown(String coin,String amount,int i,int j,int [][]dp) {
		if(j==amount.length()) {
			return 1;
		}
		if(i==coin.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int inc = 0;
		int exc = 0;
		if(coin.charAt(i) == amount.charAt(j)) {
			inc = distinct_subsequencetopdown(coin,amount,i+1,j+1,dp);
		}
		exc = distinct_subsequencetopdown(coin,amount,i+1,j,dp);
		return dp[i][j]=inc+exc;
		
	}

}


package Competitive_programming;

import java.util.Scanner;

public class ValidPasswordGeneration {
	static int mod = 10 ^ 9 + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(validpass(n, k));
		
	}

	public static int validpass(int n, int k) {
		int sum = 0, ans = 0;
		int[][] dp = new int[n+1][k+1];
		dp[n][k] = 26;
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= Math.min(i, k-1); j++) {
				dp[i][j] = dp[i - 1][j - 1]; // 0,0 = a dp[1][1] = 26 2 sai k-1
				sum+=dp[i-1][j-1]%mod;

			}
		}
		
	}

}

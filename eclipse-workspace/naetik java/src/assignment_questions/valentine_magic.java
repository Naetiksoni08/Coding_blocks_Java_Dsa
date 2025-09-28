package assignment_questions;

import java.util.Arrays;
import java.util.Scanner;

public class valentine_magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 2 boys
		int m = sc.nextInt(); // 5 girls
		
		int[] chocolates = new int[n];
		for (int i = 0; i < chocolates.length; i++) {
			chocolates[i] = sc.nextInt(); // no of
		}
		int[] candies = new int[m];
		for (int i = 0; i < candies.length; i++) {
			candies[i] = sc.nextInt();
		}
		Arrays.sort(chocolates);
		Arrays.sort(candies);
		
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(valentine(chocolates, candies, 0, 0, dp));

	}

	public static int valentine(int[] boys, int[] girls, int i, int j, int[][] dp) {
		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 1000000;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int pair =Math.abs(boys[i] - girls[j])  + valentine(boys, girls, i + 1, j + 1, dp);
		int no_pair = valentine(boys, girls, i, j + 1, dp); // move girls index forward
		return dp[i][j] = Math.min(pair, no_pair);
	}

}

//Jab hum absolute difference ko minimize karna chahte hain, toh har boy ko uske closest girl ke saath pair karna best strategy hoti hai.
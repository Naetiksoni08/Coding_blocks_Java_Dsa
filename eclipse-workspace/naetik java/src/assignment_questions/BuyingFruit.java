package assignment_questions;

import java.util.Arrays;
import java.util.Scanner;

public class BuyingFruit {
	static int[][] dp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt(); // no of shops
			int[][] arr = new int[n][3];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			dp = new int[n][3];
			for (int i = 0; i < n; i++) {
				Arrays.fill(dp[i], -1);
			}
			System.out.println(buyingfruit(arr, 0, -1, dp));
		}
//		  {1, 50, 50},  // Shop 0
//		  {50, 50, 50}, // Shop 1
//		  {1, 50, 50}   // Shop 2
//		   i = current shop index
//		
	}

	public static int buyingfruit(int[][] arr, int i, int prevchoice, int[][] dp) {
		if (i == arr.length) {
			return 0;
		}
		if (prevchoice != -1 && dp[i][prevchoice] != -1) {
			return dp[i][prevchoice];
		}

		int ans = Integer.MAX_VALUE;

		for (int fruits = 0; fruits < 3; fruits++) {
			if (fruits != prevchoice) {// Check karte hai ki same fruit consecutive shop me na ho
				ans = Math.min(ans, arr[i][fruits] + buyingfruit(arr, i + 1, fruits, dp));
//current fruit ka cost + next fruit ka cost
			}

		}
		if (prevchoice != -1) 
		 dp[i][prevchoice] = ans;
		return ans;
	}

}

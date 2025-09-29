package assignment_questions;

import java.util.Arrays;
import java.util.Scanner;

public class rod_cutting_problem_dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] price = new int[n];
		for (int i = 0; i < price.length; i++) {
			price[i] = sc.nextInt();

		}
		int rod = sc.nextInt();
		int[][] dp = new int[price.length + 1][rod + 1];
		for (int[] arr : dp) {
			Arrays.fill(arr, -1);
		}
		System.out.println(rod_cutting(price, rod, 0, dp));

	}

	public static int rod_cutting(int[] price, int target, int i, int[][] dp) {
		if (i >= price.length) {
			return 0;
		}
		if (dp[i][target] != -1) {
			return dp[i][target];
		}
		int cut = 0;
		if (i+1 <= target) {
			cut = price[i] + rod_cutting(price, target - (i+1), i, dp);
		}
		int nocut = rod_cutting(price, target, i + 1, dp);
		return dp[i][target] = Math.max(cut, nocut);

	}

}

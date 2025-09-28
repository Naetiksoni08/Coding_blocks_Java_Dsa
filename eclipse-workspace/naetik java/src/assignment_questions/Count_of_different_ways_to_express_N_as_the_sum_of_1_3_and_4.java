package assignment_questions;

import java.util.*;

public class Count_of_different_ways_to_express_N_as_the_sum_of_1_3_and_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = { 1, 3, 4 };
		long[] dp = new long[n + 1];
		Arrays.fill(dp, -1);

		long result = countdifferentways(n, arr, dp);
		System.out.println(result);

	}

	public static long countdifferentways(int target, int[] arr, long[] dp) {
		if (target == 0) return 1;
		if (target < 0) return 0;
		if (dp[target] != -1) return dp[target];
		long total = 0;
		for (int num : arr) {
			total += countdifferentways(target - num, arr, dp);
		}
		return dp[target] = total;

	}

}

//int st = countdifferentways(n - 1, dp);
//int three = countdifferentways(n - 3, dp); 
//int four = countdifferentways(n - 4, dp);



//
//int in Java can hold roughly up to 2 × 10^9.
//N itself goes only up to 10^8, which seems okay at first glance… BUT the number of ways to express N as sums (like 1, 3, 4) grows exponentially with N.
//For N = 10^8, the answer will be way bigger than 2 × 10^9 → overflow if you use int.
//long can hold up to 9 × 10^18, so it’s safe even for these huge answers.

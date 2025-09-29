package assignment_questions;

import java.util.*;

public class number_of_steps_to_reach_1 {
	   static Map<Integer, Integer> dp = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int[]dp = new int[n+1];
//		Arrays.fill(dp, -1);
		Map<Integer, Integer> dp = new HashMap<>();
		System.out.println(reach_one(n));

	}

	public static int reach_one(int n) {
		if (n == 1) {
			return 0;
		}
		if (n <= 0) { // if number get equal to or smaller than 0
			return 0;
		}
		if (dp.containsKey(n)) {
			return dp.get(n);
		}
		int step;
		
		if (n % 2 == 0) {
			step = 1 + reach_one(n / 2);
		} else {
			  step = 1 + Math.min(reach_one(n - 1), reach_one(n + 1));
		}
		dp.put(n, step);
		return step;
	}

//	public static int reach_one(int n, int[] dp) {
//		if (n == 1) {
//			return 0;
//		}
//
//		if (n <= 0) { // if number get equal to or smaller than 0
//			return 0;
//		}
//		if (dp[n] != -1) {
//			return dp[n];
//		}
//		int even = Integer.MAX_VALUE;
//		int odd = Integer.MAX_VALUE;
//		if (n % 2 == 0) {
//			even = 1 + reach_one(n / 2, dp);
//		} else {
//			int r1 = 1 + reach_one(n + 1, dp);
//			int r2 = 1 + reach_one(n - 1, dp);
//			odd = Math.min(r1, r2);
//		}
//		return dp[n] = Math.min(even, odd);
//	}

}
//
//dp[n + 1] will cause ArrayIndexOutOfBoundsException.
//To avoid this, you can either:
//Use a Map<Integer,Integer> instead of array for memoization, or

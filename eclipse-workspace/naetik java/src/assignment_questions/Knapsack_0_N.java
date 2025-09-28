package assignment_questions;

import java.util.*;

public class Knapsack_0_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// no of item
		int capacity = sc.nextInt(); // maximum capacity

		int[] wt = new int[n];
		for (int i = 0; i < wt.length; i++) {
			wt[i] = sc.nextInt();
		}

		int[] valitem = new int[n];
		int[][] dp = new int[n][capacity + 1];
		for (int[] arr : dp) {
			Arrays.fill(arr, -1);
		}
		for (int i = 0; i < valitem.length; i++) {
			valitem[i] = sc.nextInt();
		}
		System.out.println(knapsack(wt, valitem, capacity, 0, dp));

	}

	public static int knapsack(int[] wt, int[] val, int cap, int i, int[][] dp) {
		if (cap == 0 || i == wt.length) {
			return 0;
		}
		if (dp[i][cap] != -1) {
			return dp[i][cap];
		}
		int pick = 0, no_pick = 0;
		if (cap >= wt[i]) {
			pick = val[i] + knapsack(wt, val, cap - wt[i], i, dp);
		}
		no_pick = knapsack(wt, val, cap, i + 1, dp);
		return dp[i][cap] = Math.max(pick, no_pick);

	}// the only difference in this question and in knapsack 0 1 was that in that
		// question Each item can be picked at most once...while in this question it was
		// like Each item can be picked unlimited times... just like unlimited supply of
		// coin so the only thing that changed was that when we will pick a weight then
		// we can pick it n more times so i doesnt move to next position it stays there

}

package assignment_questions;

import java.util.*;

public class Maximum_Loot_knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// no of item
		int capacity = sc.nextInt(); // maximum capacity

		int[] valitem = new int[n];
		for (int i = 0; i < valitem.length; i++) {
			valitem[i] = sc.nextInt();
		}
		int[] wt = new int[n];
		int[][] dp = new int[n][capacity + 1];
		for (int[] arr : dp) {
			Arrays.fill(arr, -1);
		}
		for (int i = 0; i < wt.length; i++) {
			wt[i] = sc.nextInt();
		}

		System.out.println(maximum_loot(wt, valitem, capacity, 0,dp));
	}

	public static int maximum_loot(int[] wt, int[] val, int cap, int i,int [][]dp) {
		if (cap == 0 || i == wt.length) {
			return 0;
		} 
		if(dp[i][cap]!=-1) {
			return dp[i][cap];
		}

		int pick = 0, no_pick = 0;
		if (cap >= wt[i]) {
			pick = val[i] + maximum_loot(wt, val, cap - wt[i], i + 1,dp);

		}
		no_pick = maximum_loot(wt, val, cap, i + 1,dp);
		return dp[i][cap]=Math.max(pick, no_pick);

	}

}

//Item 1 → value = 10
//Item 2 → value = 40
//Item 3 → value = 50
//Item 4 → value = 70
//Item 1 → weight = 1
//Item 2 → weight = 3
//Item 3 → weight = 4
//Item 4 → weight = 5

//Item	Value	Weight capacity = 10
//1	     10	      1
//2	     40	      3
//3	     50       4
//4	     70	      5
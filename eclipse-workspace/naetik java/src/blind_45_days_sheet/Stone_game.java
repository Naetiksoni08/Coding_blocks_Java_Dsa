package blind_45_days_sheet;

import java.util.Arrays;

public class Stone_game {
	public static void main(String[] args) {
		int[] stones = { 3, 7, 2, 3 };
		int[][] dp = new int[stones.length][stones.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		int diff = stone(stones, 0, stones.length - 1, dp);
		System.out.println(diff > 0); // diff = AliceScore - BobScore 
//		diff > 0 → Alice wins
//		diff < 0 → Bob wins

	}

	public static int stone(int[] arr, int i, int j, int[][] dp) {
		if (i == j) {
			return arr[i];

		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int st_pick = arr[i] - stone(arr, i + 1, j,dp); // // minus because next call is opponent's turn → opponent's gain
														// is my loss
		int nd_pick = arr[j] - stone(arr, i, j - 1,dp);
		return dp[i][j]= Math.max(st_pick, nd_pick);

	}//O(n^2) tc

}

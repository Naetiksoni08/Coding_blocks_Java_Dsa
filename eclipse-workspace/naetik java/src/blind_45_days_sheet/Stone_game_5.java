package blind_45_days_sheet;

import java.util.Arrays;

public class Stone_game_5 {
	public static void main(String[] args) {
		int[] stone = { 6, 2, 3, 4, 5, 5 };
		int n = stone.length;
		int[][] dp = new int[n][n];
		for (int[] x : dp) {
			Arrays.fill(x, -1);
		}
		int[] prefix = new int[n + 1];
		for (int i = 0; i < n; i++) {
			prefix[i + 1] = stone[i] + prefix[i]; // O(1) 
		}
		System.out.println(stone(0, n - 1, prefix, dp));

	}

	public static int stone(int l, int r, int[] prefix, int[][] dp) {
		if (l == r) {
			return 0; // if one stone is left then split not possible
		}
		if (dp[l][r] != -1) {
			return dp[l][r];
		}
		int maxScore = 0;
		for (int k = l; k < r; k++) {
			int leftSum = prefix[k + 1] - prefix[l];
			int rightSum = prefix[r + 1] - prefix[k + 1];

			if (leftSum < rightSum) {
				maxScore = Math.max(maxScore, leftSum + stone(l, k, prefix, dp));
			} else if (leftSum > rightSum) {
				maxScore = Math.max(maxScore, rightSum + stone(k + 1, r, prefix, dp));
			} else {
				maxScore = Math.max(maxScore, leftSum + Math.max(stone(l, k, prefix, dp), stone(k + 1, r, prefix, dp)));
				// if leftsum and rightsum are equal then first of u can add either of sum
				// becuase they are equal but keeping in mind the future prospects that future
				// mai best konsa remianing array hoga so thats why l,k and k+1,r
			}

		}
		return dp[l][r] = maxScore;
	}

}

package blind_45_days_sheet;

import java.util.Arrays;

public class number_of_sets_of_k_non_overlapping_line_segments {
	static int MOD = 1_000_000_007; // 10^9+7

	public static void main(String[] args) {
		int n = 30;
		int k = 7;
		int[][][] dp = new int[n + 1][k + 1][2]; // i,k,isopen
		for (int[][] a : dp) {
			for (int[] b : a) {
				Arrays.fill(b, -1);
			}
		}
		System.out.println(solve(0, k, 0, n, dp));

	}

	public static int solve(int i, int k, int isOpen, int n, int[][][] dp) { // i is for where are currently standing k
																				// is for how
		// many
		// segments we need to make more then isopen is for is there any
		// segmnet which is currently open ( means start toh kia segment
		// banana but end nai kia ) isopen = 0 that means no segment is
		// open kuch bhi bana sakte ho and isopen = 1 means yes there is
		// a segment open so we need to close that
		if (k == 0 && isOpen == 0) {
			return 1;
		}
		if (i == n) {
			return 0;
		}
		if (dp[i][k][isOpen] != -1) {
			return dp[i][k][isOpen];
		}

		int ways = 0;
		if (isOpen == 0) {
			ways = (ways + solve(i + 1, k, 0, n, dp)) % MOD; // skip this point
			if (k >= 1) {
				ways = (ways + solve(i + 1, k, 1, n, dp)) % MOD; // 1 means ki now one segment is open
			}
		} else {
			ways = (ways + solve(i, k - 1, 0, n, dp)) % MOD; // close this segment here so isopen becomes 0
			ways = (ways + solve(i + 1, k, 1, n, dp)) % MOD; // start a new segment from i+1 so isopen = 1

			// i will not be made i+1 in the else block first call because if 1 segment is
			// ending at x endpoint then we can start a new segment from that x itself given
			// in the qurestion endpoints can be shared
		}
		dp[i][k][isOpen] = ways;
		return dp[i][k][isOpen];

	}

}

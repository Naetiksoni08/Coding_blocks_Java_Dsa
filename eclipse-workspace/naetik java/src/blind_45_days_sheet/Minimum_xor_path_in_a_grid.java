package blind_45_days_sheet;

import java.util.Arrays;

public class Minimum_xor_path_in_a_grid {

	public static void main(String[] args) {
		int[][] grid = { { 1, 2 }, { 3, 4 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] arr : dp) {
			Arrays.fill(arr, -1);
		}
		System.out.println(minimum(grid, 0, 0, dp));
	}

	public static int minimum(int[][] grid, int i, int j, int[][] dp) {
		if (i == grid.length - 1 && j == grid[0].length - 1) {
			return grid[i][j];
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int right = Integer.MAX_VALUE;
		int down = Integer.MAX_VALUE;

		if (j + 1 < grid[0].length) {
			right = grid[i][j] ^ minimum(grid, i, j + 1, dp);
		}
		if (i + 1 < grid.length) {
			down = grid[i][j] ^ minimum(grid, i + 1, j, dp);
		}
		dp[i][j] = Math.min(right, down);
		return dp[i][j];

	} // this is not the correct osolution because xor orders are not preserved
}

//
//
//public int minCost(int[][] grid) {
//    int m = grid.length, n = grid[0].length;
//    Set<Integer>[][] dp = new HashSet[m][n];
//    
//    for(int i = 0; i < m; i++)
//        for(int j = 0; j < n; j++)
//            dp[i][j] = new HashSet<>();
//    
//    dp[0][0].add(grid[0][0]);
//    
//    for(int i = 0; i < m; i++) {
//        for(int j = 0; j < n; j++) {
//            if(i == 0 && j == 0) continue;
//            if(i > 0) for(int val : dp[i-1][j]) dp[i][j].add(val ^ grid[i][j]);
//            if(j > 0) for(int val : dp[i][j-1]) dp[i][j].add(val ^ grid[i][j]);
//        }
//    }
//    return Collections.min(dp[m-1][n-1]);
//} this is the correct solution

//Teri approach:
//"Abhi tak ka sabse chhota route store karo"
//→ But chhota route aage jaake dead end de sakta hai!
//
//New approach:
//"Saare possible routes store karo"
//→ End mein best route choose karo! ✅
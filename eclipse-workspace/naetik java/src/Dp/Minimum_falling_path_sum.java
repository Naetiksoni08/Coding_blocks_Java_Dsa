package Dp;

import java.util.Arrays;

public class Minimum_falling_path_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for(int []a:dp) {
			Arrays.fill(a, -1000000);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(ans, fallingpath(grid, 0, i,dp));

		}
		System.out.println(ans);


	}

	public static int fallingpath(int[][] arr, int cr, int cc,int [][]dp) { // current row and column
		if (cc < 0 || cc >= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if (cr == arr.length - 1) {
			return arr[cr][cc];
		}
		if(dp[cr][cc] != -1000000) {
			return dp[cr][cc];
		}
		int leftdiagonal = fallingpath(arr, cr + 1, cc - 1,dp);
		int down = fallingpath(arr, cr + 1, cc,dp);
		int rightdiagonal = fallingpath(arr, cr + 1, cc + 1,dp);
		return dp[cr][cc]= Math.min(leftdiagonal, Math.min(down, rightdiagonal)) + arr[cr][cc];
	}

}

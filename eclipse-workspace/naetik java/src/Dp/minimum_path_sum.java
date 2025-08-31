package Dp;

import java.util.Arrays;

public class minimum_path_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
//		System.out.println(pathsum(arr,0,0));
		int [][]dp = new int [arr.length+1][arr[0].length+1];
		for(int []a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(pathsumtopdown(arr, 0, 0, dp));
		

	}

	public static int pathsum(int[][] arr, int r, int c) {
		if(r==arr.length-1 && c==arr[0].length-1) {
			return arr[r][c];
			}
		if(r>=arr.length || c>=arr[0].length) {
			return Integer.MAX_VALUE;
		}
		int ans = 0;
		int right = pathsum(arr, r, c + 1);
		int down = pathsum(arr, r + 1, c);
		ans = Math.min(right, down)+arr[r][c];
		return ans;
	}
	public static int pathsumtopdown(int[][] arr, int r, int c,int [][]dp) {
		if(r==arr.length-1 && c==arr[0].length-1) {
			return arr[r][c];
			}
		if(r>=arr.length || c>=arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if(dp[r][c]!=-1) {
			return dp[r][c];
		}
		int ans = 0;
		int right = pathsumtopdown(arr, r, c + 1,dp);
		int down = pathsumtopdown(arr, r + 1, c,dp);
		ans = Math.min(right, down)+arr[r][c];
		return dp[r][c] = ans;
	}
}

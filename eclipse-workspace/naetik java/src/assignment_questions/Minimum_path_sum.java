package assignment_questions;

import java.util.Scanner;

public class Minimum_path_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // rows
		int m = sc.nextInt(); // colms
		
		int[][] arr = new int[n][m];
		int[][] dp = new int[n][m];
		
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(minimumpathsum(arr, 0, 0, dp));

	}

	public static int minimumpathsum(int[][] arr, int r, int c, int[][] dp) {
		if (r == arr.length - 1 && c == arr[0].length - 1) {
			return arr[r][c]; // agar length ke eqaul hogai value toh voh wali value return kardenge
		}
		if (r >= arr.length || c >= arr[0].length) {
			return Integer.MAX_VALUE; // dont return 0 cuz otherwise that will be our answer cuz it is the minimum
			// if r and c goes beyond range then return +infinity
		}
		if (dp[r][c] != -1) {
			return dp[r][c];
		}
		int right = minimumpathsum(arr, r, c + 1, dp);
		int down = minimumpathsum(arr, r + 1, c, dp);
		return dp[r][c] = Math.min(right, down) + arr[r][c]; // arr ki current value ko bhi toh add karenge na

	}

}

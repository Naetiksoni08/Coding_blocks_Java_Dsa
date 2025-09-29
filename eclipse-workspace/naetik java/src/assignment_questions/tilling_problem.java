package assignment_questions;

import java.util.Arrays;
import java.util.Scanner;

public class tilling_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(problem(n,dp));

	}

	public static int problem(int n,int [] dp) {
		if (n == 1) {
			return 1; // for vertical tiles
		}
		if (n == 2) {
			return 2;
		}
		if(dp[n]!=-1) {
			return dp[n];
		}
		int ways = 0;
		ways = problem(n - 1,dp) + problem(n - 2,dp);//Place a vertical tile in the first column....Place two horizontal tiles in first 2 columns
		return dp[n] = ways;
	}

}

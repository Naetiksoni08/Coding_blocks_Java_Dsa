package Competitive_programming;

import java.util.Scanner;

public class Alternating_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long n = sc.nextInt();
		int[] arr = new int[(int) n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

	}

	public static void alternating_function(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int[][] dp = new int[i][arr.length - 1];
			dp[0][1] = arr[0];
			
			}
	}

}

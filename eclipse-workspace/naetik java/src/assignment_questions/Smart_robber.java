package assignment_questions;

import java.util.*;

public class Smart_robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int[] dp = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(smart_robber(arr, 0, dp));
		}
	}

	public static int smart_robber(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}

		if (dp[i] != 0) {
			return dp[i];
		}
		int rob = arr[i] + smart_robber(arr, i + 2, dp);
		int no_rob = smart_robber(arr, i + 1, dp);
		return dp[i] = Math.max(rob, no_rob);
	}

}

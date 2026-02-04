package blind_45_days_sheet;

import java.util.Arrays;

public class Stone_game_3 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 7 };
		int[] dp = new int[arr.length + 3];
		Arrays.fill(dp, Integer.MIN_VALUE);
		int diff = StoneGame(arr, 0, dp);
		if (diff > 0)
			System.out.println("Alice");
		else if (diff < 0)
			System.out.println("Bob");
		else
			System.out.println("Tie");
	}

	public static int StoneGame(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != Integer.MIN_VALUE) {
			return dp[i];
		}
		int ans = Integer.MIN_VALUE;
		ans = Math.max(ans, arr[i] - StoneGame(arr, i + 1, dp));
		// 2nd stone
		if (i + 1 < arr.length) { // // 2 stones lene ke liye i aur i+1 access hote hain,
			// so check that i+1 is within array bounds
			ans = Math.max(ans, arr[i] + arr[i + 1] - StoneGame(arr, i + 2, dp));

		}
		// 3rd stone
		if (i + 2 < arr.length) {
			ans = Math.max(ans, arr[i] + arr[i + 1] + arr[i + 2] - StoneGame(arr, i + 3, dp));
		}
		return dp[i] = ans;
	}

}

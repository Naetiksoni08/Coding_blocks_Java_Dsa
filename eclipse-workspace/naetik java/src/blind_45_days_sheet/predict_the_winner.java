package blind_45_days_sheet;

import java.util.*;

public class predict_the_winner {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 2 };
		int[][] dp = new int[arr.length][arr.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		int ans = predict(arr, 0, arr.length - 1, dp);
		System.out.println(ans >= 0);
		// ans = (current player ka score) − (opponent ka score)
	}

	public static int predict(int[] arr, int i, int j, int[][] dp) {
		if (i == j) {
			return arr[i]; // if Array me sirf ek element bacha so Wo element current player utha lega
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int p1_pick = arr[i] - predict(arr, i + 1, j, dp);
		int p2_pick = arr[j] - predict(arr, i, j - 1, dp);
		return dp[i][j] = Math.max(p1_pick, p2_pick);
	}

}

//diff > 0 → Player 1 jeet gaya
//diff == 0 → tie, but question kehta hai → Player 1 winner
//diff < 0 → Player 1 haar gaya
package bitmasking;

public class min_cost_to_climb_stairs_buttomup {
	public static void main(String[] args) {
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		System.out.println(mincost(arr));
	}

	public static int mincost(int[] arr) {
		int n = arr.length;
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 0;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = Math.min(dp[i - 1] + arr[i - 1], dp[i - 2] + arr[i - 2]);

		}
		return dp[n];
	}

}

//Because we are allowed to start from step 0 or step 1 without paying any cost initially, we take dp[0] and dp[1] as base cases and initialize them to 0.
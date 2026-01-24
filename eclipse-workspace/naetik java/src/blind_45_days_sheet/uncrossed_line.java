package blind_45_days_sheet;

public class uncrossed_line {
	// this question is exactly same as the longest common subsequence
	public static void main(String[] args) {
		int[] num1 = { 1, 4, 2 };
		int[] num2 = { 1, 2, 4 };
		System.out.println(lcsBU(num1, num2));

	}

	public static int lcsBU(int[] arr1, int[] arr2) {
		int[][] dp = new int[arr1.length + 1][arr2.length + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (arr1[i - 1] == arr2[j - 1]) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					int f = dp[i - 1][j];
					int s = dp[i][j - 1];
					dp[i][j] = Math.max(f, s);

				}
			}

		}
		return dp[dp.length - 1][dp[0].length - 1];

	}

}

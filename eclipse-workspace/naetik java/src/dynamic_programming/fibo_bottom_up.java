package dynamic_programming;

public class fibo_bottom_up {

	public static void main(String[] args) {

		int n = 5;
		int[] dp = new int[n + 1];
		System.out.println(fibobottomup(n));

	}

	public static int fibobottomup(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i-1]+dp[i-2];

		}
		return dp[dp.length-1];

	}

}

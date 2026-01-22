package blind_45_days_sheet;

public class fibo_dp_TD {
	public static void main(String[] args) {
		int n = 5;
		int[] dp = new int[n+1];
		System.out.println(fibo(n, dp));

	}

	public static int fibo(int n, int[] dp) {
		if (n == 1 || n == 0) {
			return n;
		}
		if (dp[n] != 0) {
			return dp[n]; // applied dp
		} 
		int f1 = fibo(n - 1, dp);
		int f2 = fibo(n - 2, dp);
		return dp[n] = f1 + f2; // yaad karo dp mai
	}

}

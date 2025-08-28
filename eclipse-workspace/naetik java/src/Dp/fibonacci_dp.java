package Dp;

public class fibonacci_dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] dp = new int[n + 1];
		System.out.println(top_down_fibo(n, dp));
		System.out.println(fibo_Bottom_up(n));
		

	}

	public static int fibo(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int f1 = fibo(n - 1);
		int f2 = fibo(n - 2);
		return f1 + f2;
	}

	public static int top_down_fibo(int n, int[] dp) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (dp[n] != 0) { // if not equal to 0 then the value is computed in the array cuz no fibonacci
							// has a value of 0 accept 0 so any value accept 0 will be already computer
							// value
			return dp[n];
		}

		int f1 = top_down_fibo(n - 1, dp);
		int f2 = top_down_fibo(n - 2, dp);
		return dp[n] = f1 + f2; // phele yaad hoga fir return hoga
	}
	public static int fibo_Bottom_up(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i < dp.length; i++) {
           dp[i] = dp[i-1] + dp[i-2];
           
		}
		return dp[n];
	}

}

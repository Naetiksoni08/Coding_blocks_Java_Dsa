package blind_45_days_sheet;

public class fibo_dp_BU {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(fiboBU(n));
	}
	public static int fiboBU(int n) {
		int [] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2;i <dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	
	}

}

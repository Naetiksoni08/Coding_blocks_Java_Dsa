package blind_45_days_sheet;

public class house_robber_dp_BU {
	public static void main(String[] args) { // recursion piche sai chal raha hai toh dp aage sai fill hogi
		int[] arr = { 7, 5, 3, 13, 1 };
		System.out.println(houserobber(arr));
	}

	public static int houserobber(int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		}
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < dp.length; i++) {
			int rob = arr[i] + dp[i - 2];
			int norob = dp[i - 1];
			dp[i] = Math.max(rob, norob);
			
		}
		return dp[dp.length-1];
	}

}// jab recursion piche sai chalega toh dp table aage sai fill hoga jaise house
	// robber
// jab recursion aage sai chalega toh dp table piche sai fill hogi jaise fibo

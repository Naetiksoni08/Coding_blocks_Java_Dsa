package blind_45_days_sheet;

public class coin_change_2_BU {
	public static void main(String[] args) {
		int[] coins = { 1, 2, 5 };
		int amount = 5;
		System.out.println(coinchangeBu(coins, amount));
	}

	public static int coinchangeBu(int[] coin, int amount) {
		int[][] dp = new int[amount + 1][coin.length + 1];
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = 1; // if amount is zero then we wont pick any coin so fill 1 if amount is 0
		}
		for (int am = 1; am < dp.length; am++) { // amount
			for (int i = 1; i < dp[0].length; i++) { // coin
				int inc = 0, exc = 0;
				if (coin[i - 1] <= am) {
					inc = dp[am - coin[i - 1]][i];
				}
				exc = dp[am][i - 1]; // why i-1 because recursion piche sai chal raha hai
				dp[am][i] = inc + exc;
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];

	} // time and space complexity will be amount*no of coin
}

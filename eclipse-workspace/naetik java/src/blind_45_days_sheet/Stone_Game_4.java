package blind_45_days_sheet;

import java.util.*;

public class Stone_Game_4 {
	public static void main(String[] args) {
		int n = 7;
		Boolean[]dp = new Boolean[n+1];
		System.out.println(stone(n,dp));
	}

	public static boolean stone(int n,Boolean[]dp) {
		if (n == 0) { // If it's your turn and there are 0 stones →You cannot remove anything →you lose
			return false;
		}
		if(dp[n]!=null) {
			return dp[n];
		}
		for (int i = 1; i * i <= n; i++) {
			if (!stone(n - i * i,dp)) {
				dp[n] = true;
				return true;
			}
		
		}
		dp[n] = false;
		return false;

	}

}

package dynamic_programming;

import java.util.Arrays;

public class coin_change2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coin= {1,2,5};
		int amount  = 5;
		int [][]dp = new int[amount+1][coin.length];
		for(int[]a:dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(coin(coin,amount,0,dp));
		
	}
	public static int coin(int []coin,int amount,int idx,int[][]dp) {
		if(amount==0) {
			return 1;
			
		}
		if(dp[amount][idx]!=-1) {
			return dp[amount][idx];
		}
		if(idx == coin.length) {
			return 0;
		}
		int inc = 0;
		int exc = 0;
		if(coin[idx]<=amount) {
			inc = coin(coin,amount-coin[idx],idx,dp);
			
		}
		exc = coin(coin,amount,idx+1,dp);
		return dp[amount][idx]= inc+exc;
		
	}

}

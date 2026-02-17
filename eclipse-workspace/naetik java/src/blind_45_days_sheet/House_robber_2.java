package blind_45_days_sheet;

import java.util.Arrays;

public class House_robber_2 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 2 };
		int[][]dp = new int[arr.length+1][arr.length+1];// end kabhi arr.length tak ja sakta hai (Case 2 mein) thats why +1,+1
		for(int []a:dp) {
			Arrays.fill(a, -1);
		}
		if(arr.length==1) System.out.println(arr[0]);
		int ans1 = houserobber(arr, 0, arr.length - 1,dp);// 0 sai n-1
		int ans2 = houserobber(arr, 1, arr.length,dp); // // 1 sai n
		System.out.println(Math.max(ans1, ans2));
	}

	public static int houserobber(int[] arr, int i, int end,int[][]dp) {
		if (i >= end) {
			return 0;
		}
		
		if(dp[i][end]!=-1) {
			return dp[i][end];
		}
		// 1 sai n-1
		int rob = arr[i] + houserobber(arr, i + 2, end,dp);
		int norob = houserobber(arr, i + 1, end,dp);
		return dp[i][end]= Math.max(rob, norob);

	}

}

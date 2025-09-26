package assignment_questions;

import java.util.*;

public class House_robber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// House Robber II ka main twist hi yeh hai ki first aur last house adjacent
		// hote hain.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] dp = new int[n];
		Arrays.fill(dp, -1);
		int result1 = houserobber(arr, 0, arr.length - 2, dp);// last hosue ko ignore karo
		Arrays.fill(dp, -1);
		int result2 = houserobber(arr, 1, arr.length - 1, dp); // first house ko ignore karo
		System.out.println(Math.max(result1, result2));

	}

	public static int houserobber(int[] arr, int i, int endpoint, int[] dp) {
		if (i > endpoint) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + houserobber(arr, i + 2, endpoint, dp);
		int no_rob = houserobber(arr, i + 1, endpoint, dp);
		return dp[i] = Math.max(rob, no_rob); // pura code same hai bro bas upar wali cheez change hui hai ki ek baar
												// last ghar ko hide kardo aur ek baar first wale house ko yani 2 3 2 so
												// 3 2 ka max ek baar aur ek baar 2 3 ka max bas 3 3 ayega dono mai

	}

}

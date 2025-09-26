package assignment_questions;


import java.util.*;

public class longest_increasing_sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(LIS(arr));
		

	}

	public static int LIS(int[] arr) {
		int[] dp = new int[arr.length];
		Arrays.fill(dp, 1);
		for (int i = 1; i < arr.length; i++) {
			for (int j = i - 1; j >= 0; j--) { // i jaise 1 par aya toh hum 0 check kar rahe hai i 2 par aaya toh hum 1 aur 0 ko check kar rahe hai  piche piche loop laga ke check kr rahe hai 
				if (arr[j] < arr[i]) { //piche wali value agar choti hai arr i sai toh hi kuch karenge
					int jth = dp[j];
					dp[i] = Math.max(dp[i], jth + 1);

				}
			}
			

		}
		int max = dp[0];
		for (int i = 1; i < dp.length; i++) {
			max = Math.max(max, dp[i]);
		}
		return max;
	
		

	}

}

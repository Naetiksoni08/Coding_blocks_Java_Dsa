package assignment_questions;

import java.util.Arrays;
import java.util.Scanner;

public class MInimum_money_needed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // no of friends
		int weight = sc.nextInt(); // total weight
		int[] price = new int[weight];
		for (int i = 0; i < price.length; i++) {
			price[i] = sc.nextInt();
		}
		 int[][] dp = new int[weight][weight + 1];
	     for (int[] arr : dp) 
	    Arrays.fill(arr, -1);
		int result = minimum_money(weight, price, 0, dp);
		System.out.println(result >= Integer.MAX_VALUE ? -1 : result);

	}

	public static int minimum_money(int weight, int[] price, int i, int[][] dp) {
		if (weight == 0) {
			return 0;
		}
		if (weight < 0 || i >= price.length) {
			return Integer.MAX_VALUE;
		}
		if (dp[i][weight] != -1) {
			return dp[i][weight];
		}
		int pick = Integer.MAX_VALUE;
		int packetWeight = i + 1;
		if (price[i] != -1 && weight >= packetWeight) {
			pick = minimum_money(weight - packetWeight, price, i, dp);
			if (pick != Integer.MAX_VALUE) {
				pick += price[i];
			}
		}
		int Not_Pick = minimum_money(weight, price, i + 1, dp);
		return dp[i][weight] = Math.min(pick, Not_Pick);
	}
}

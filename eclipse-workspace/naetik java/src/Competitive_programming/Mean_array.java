package Competitive_programming;

import java.util.*;

public class Mean_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Meanarr(arr, s);
	}

	public static void Meanarr(int[] arr, int s) {
		int ans = 0;
		int n = arr.length;
		int[] prefixsum = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			prefixsum[i] += prefixsum[i - 1];
		}
		for (int i = 0; i <= n; i++) {
			prefixsum[i] -= s * i;
		}
		HashMap<Integer, Integer> freq = new HashMap<>();
		for (int i = 0; i <= n; i++) {
			ans += freq.getOrDefault(arr[i], 0);
			freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);

		}
		System.out.println(ans);

	}

}

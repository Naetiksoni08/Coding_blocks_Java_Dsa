package Competitive_programming;

import java.util.*;

public class Books_cf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(books(arr, m));

	}

	public static int books(int[] arr, int minutes) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int sum = 0;
		while (ei < arr.length) {
			// grow

			sum += arr[ei];

			// shrink
			while (sum > minutes) {
				sum -= arr[si];
				si++;
			}

			// ans
			ans = Math.max(ans, ei - si + 1);
			ei++;

		}
		return ans;

	}

}
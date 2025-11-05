package Competitive_programming;

import java.util.Scanner;

public class powerful_partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(sack(arr, k, 0));

	}

	public static int sack(int[] arr, int k, int idx) {
		if(k==0 || arr.length == idx) {
			return 0;
		}
		int inc = 0;
		int exc = 0;
		if (k >= arr[idx]) {
			inc = sack(arr, k - arr[idx], idx+1);
		}
		exc = sack(arr, k, idx+1);
		
	}

}

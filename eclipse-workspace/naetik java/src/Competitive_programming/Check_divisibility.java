package Competitive_programming;

import java.util.*;

public class Check_divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

	}

	public static int check(int[] arr, int k) {
		long sum = 0;
		int ans = 0;
		HashMap<Integer, Integer> min = new HashMap<>();
		HashMap<Integer, Integer> max = new HashMap<>();
		
		for (int i = 0; i < k; i++) {
			sum += arr[i];
			if (sum % k == 0) {
				
			}
		}

	}

}

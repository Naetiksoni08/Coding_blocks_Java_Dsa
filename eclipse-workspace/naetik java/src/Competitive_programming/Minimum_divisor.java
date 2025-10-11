package Competitive_programming;

import java.util.Scanner;

public class Minimum_divisor { // minimum divisor

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		
	}
	public static long b_array(long [] arr,long x) {
		long sum = 0;
		for(long num:arr) {
			sum+=num/x;
		}
		return sum;

		
	}
	public static int divisor(long []arr,long k) {
		long low = 1;
		long high = Integer.MAX_VALUE;
		while(low<=high) {
			long mid = (low+high)/2;
			
			
		}
	}

}

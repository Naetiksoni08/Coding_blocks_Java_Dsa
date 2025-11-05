package Competitive_programming;

import java.util.Scanner;

public class Xor_Summation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		while (q-- > 0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int x = sc.nextInt();

		}

	}

	public static void xor(int[] arr, int l, int r, int x) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & 1) == 0) { // prefix array
				sum += arr[i];
			}
			for (int j = l; j < r; j++) {
				if ((x & 1) == 0) { // if x 0 bit is off then

				}
			}

		}
	}

}

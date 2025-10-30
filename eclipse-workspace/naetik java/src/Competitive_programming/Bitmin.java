package Competitive_programming;

import java.util.Scanner;

public class Bitmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			long c = sc.nextInt();

			System.out.println(bitmin(a, b, c));
		}

	}

	public static long bitmin(long a, long b, long c) {
		long x = 0;

		for (int i = 0; i < 63; i++) {
			long A = (a >> i) & 1;
			long B = (b >> i) & 1;
			long C = (c >> i) & 1;

			// check according to truth table
			if (A == 0 && B == 0 && C == 0) {
				// fine, x=0
			} else if (A == 0 && B == 0 && C == 1) {
				x |= (1L << i); // need x=1
			} else if (A == 0 && B == 1 && C == 0) {
				return -1;
			} else if (A == 1 && B == 0 && C == 0) {
				return -1;
			} else if (A == 1 && B == 1 && C == 0) {
				return -1;
			}
			
		}

		return x;
	}
}
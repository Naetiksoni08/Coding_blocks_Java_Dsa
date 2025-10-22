package Competitive_programming;

import java.util.Scanner;

public class Buy_an_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long x = sc.nextInt();
		System.out.println(buy(a, b, x));

	}

	public static long buy(long a, long b, long x) {
		long low = 1;
		long high = 1000000000L;
		long ans = 0;

		while (low <= high) {
			long mid = low + (high - low) / 2;
			if (isitpossible(a, b, x, mid)) {
				ans = mid; // mid that is integer can be bought, try bigger numbers
				low = mid + 1;
			} else {
				high = mid - 1;// integer that is mid only too expensive, try smaller numbers

			}
		}
		return ans;

	}

	public static boolean isitpossible(long a, long b, long x, long mid) {
		int length = String.valueOf(mid).length(); // Converts the integer n into a String.and calc its length
		long price = a * mid + b * length;
		return price <= x; // return only when price is less than equal to x
	}

}

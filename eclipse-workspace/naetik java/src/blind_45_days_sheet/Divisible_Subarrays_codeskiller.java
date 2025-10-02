package blind_45_days_sheet;

import java.util.*;

public class Divisible_Subarrays_codeskiller {

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = scn.nextInt();
			System.out.println(subarraysDivByK(arr, n));
		}
	}

	public static long subarraysDivByK(int[] arr, int n) {
		long count = 0;
		int[] prefixreminder = new int[n];
		int prefixsum = 0;
		prefixreminder[0] = 1;
		for (int i = 0; i < n; i++) {
			prefixsum += arr[i];

			int rem = ((prefixsum % n) + n) % n; // taki negative value ko ignore kr sakte isliye +n
			count+=prefixreminder[rem];
			prefixreminder[rem]++;

		}
		return count; // no of good subarrays
	}

}

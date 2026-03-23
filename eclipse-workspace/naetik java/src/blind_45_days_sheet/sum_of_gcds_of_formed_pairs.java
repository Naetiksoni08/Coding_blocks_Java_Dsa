package blind_45_days_sheet;

import java.util.Arrays;

public class sum_of_gcds_of_formed_pairs {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 4 };
		int[] prefixgcd = new int[arr.length];
		int mxi = arr[0];
		for (int i = 0; i < prefixgcd.length; i++) {
			mxi = Math.max(mxi, arr[i]);
			prefixgcd[i] = gcd(arr[i], mxi);
		}
		Arrays.sort(prefixgcd);

		int sum = 0;
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			sum += gcd(prefixgcd[left], prefixgcd[right]);
			left++;
			right--;

		}
		System.out.println(sum);
	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

}

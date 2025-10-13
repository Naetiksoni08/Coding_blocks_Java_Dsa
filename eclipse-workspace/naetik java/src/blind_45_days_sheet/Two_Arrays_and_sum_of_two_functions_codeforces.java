package blind_45_days_sheet;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Arrays_and_sum_of_two_functions_codeforces {
	static final int MOD = 998244353;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextLong();
		}
		twoarrays(n, a, b);
	}

	public static void twoarrays(int n, long[] a, long[] b) {
		long[] weight = new long[n];
		for (int i = 0; i < weight.length; i++) {
			weight[i] = (long) (i + 1) * (n - i); // left array mai i sai leke 1 tk choices and right mai remaining i
													// sai n
		}
		Arrays.sort(weight);
		Arrays.sort(b);

		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans = (ans + (weight[i] * a[i] % MOD) * b[i] % MOD) % MOD;
		}
		System.out.println(ans);

	}


}

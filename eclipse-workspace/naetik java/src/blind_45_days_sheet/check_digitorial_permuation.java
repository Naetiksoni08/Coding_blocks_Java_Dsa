package blind_45_days_sheet;

import java.util.Arrays;

public class check_digitorial_permuation {

	public static void main(String[] args) {
		int n = 145;
		int temp = n;
		int sum = 0;
		while (temp > 0) {
			int digit = temp % 10;
			sum += fact(digit);
			temp = temp / 10;
		}
		char[] a = Integer.toString(sum).toCharArray(); // sum ko sort kia
		char[] b = Integer.toString(n).toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.equals(a, b));

	}

	public static int fact(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		int fn = fact(n - 1);
		return fn * n;

	}

}

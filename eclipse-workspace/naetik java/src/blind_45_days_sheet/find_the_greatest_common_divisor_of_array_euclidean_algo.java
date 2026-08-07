package blind_45_days_sheet;

public class find_the_greatest_common_divisor_of_array_euclidean_algo {

	public static void main(String[] args) {
		int[] nums = { 2, 5, 6, 9, 10 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int num : nums) {
			if (num < min)
				min = num;
			if (num > max)
				max = num;
		}

//		return gcd(min, max);

	}

	public static int gcd(int a, int b) {
		while (b != 0) { // a = 2 b = 10
			int temp = b;
			b = a % b; // 2%10 = 2 b = 2
			a = temp; // 
		}
		return a;
	}

}

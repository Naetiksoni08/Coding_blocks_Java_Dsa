package blind_45_days_sheet;

public class sum_of_compatible_number_in_range_1 {
	public static void main(String[] args) {
		int n = 2;
		int k = 3;
		int low = Math.max(1, n - k);
		int high = n + k;
		int sum = 0;
		for (int i = low; i <= high; i++) {
			int diff = Math.abs(n - i);
			if (diff <= k && (n & i) == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}
}

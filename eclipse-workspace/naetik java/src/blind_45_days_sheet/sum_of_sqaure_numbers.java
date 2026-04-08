package blind_45_days_sheet;

public class sum_of_sqaure_numbers {
	public static void main(String[] args) {
		int c = 5;
		long a = 0; // 0
		long b = (long) Math.sqrt(c); // 5^2 = 2

		while (a <= b) {
			long sum = (a * a) + (b * b);
			if (sum == c) {
				System.out.println(true);
				return;
			} else if (sum < c) {
				a++;
			} else {
				b--;
			}

		}
		System.out.println(false);

	}

}

package blind_45_days_sheet;

public class maximum_product_of_two_digits {

	public static void main(String[] args) {
		int n = 124;
		int max1 = 0;
		int max2 = 0;

		while (n > 0) {
			int digit = n % 10;
			n /= 10;

			if (digit > max1) {
				max2 = max1;
				max1 = digit;
			} else if (digit > max2) {
				max2 = digit;
			}
		}
		System.out.println(max1 * max2);
	}

}

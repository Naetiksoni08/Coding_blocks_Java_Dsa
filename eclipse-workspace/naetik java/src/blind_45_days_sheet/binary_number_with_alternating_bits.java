package blind_45_days_sheet;

public class binary_number_with_alternating_bits {

	public static void main(String[] args) {
		int n = 5;
		int prev = n & 1;
		n >>= 1;
		while (n > 0) {
			int curr = n & 1;
			if (curr == prev) {
				System.out.println(false);
			}
			prev = curr;
			n >>= 1;

		}
		System.out.println(true);

	}

}

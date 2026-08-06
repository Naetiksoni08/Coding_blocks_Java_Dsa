package blind_45_days_sheet;

public class smallest_divisible_digit_product_1 {
	public static void main(String[] args) {
		int n = 10;
		int t = 2;
		for (int i = n;; i++) {
			int product = getProduct(i);

			if (product % t == 0) {
              System.out.println(i);
              return;
			}
		}

	}

	private static int getProduct(int num) {
		int prod = 1;
		while (num > 0) {
			prod *= num % 10;
			num /= 10;
		}
		return prod;
	}

}

package blind_45_days_sheet;

public class check_divisiblity_by_digit_sum_and_product {
	public static void main(String[] args) {
		int n = 99;
		int num = n;
		int sum = 0;
		int product = 1;

		while (num > 0) {
			int digit = num % 10;
			sum += digit;
			product *= digit;
			num /= 10;
		}
		System.out.println(n % (sum + product) == 0);
	}

}

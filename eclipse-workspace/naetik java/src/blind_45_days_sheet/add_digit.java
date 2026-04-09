package blind_45_days_sheet;

public class add_digit {

	public static void main(String[] args) {
		int n = 38;
		while (n >= 10) {
			int sum = 0;
			while (n > 0) {
				sum += n % 10;
				n /= 10;
			}
			n = sum;
		}
		System.out.println(n);
	}

}

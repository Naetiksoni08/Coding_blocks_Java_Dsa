package blind_45_days_sheet;

public class perfect_number {

	public static void main(String[] args) {
		int n = 28;
		int sum = 1;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				sum += i;
				if (i != n / i) {
					sum += n / i;
				}

			}
		}
		System.out.println(sum==n);
	}

}

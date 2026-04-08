package blind_45_days_sheet;

public class valid_perfect_sqaure {

	public static void main(String[] args) {
		int num = 16;
		long low = 1;
		long high = num;
		while (low <= high) {
			long mid = low + (high - low) / 2;
			long square = mid * mid;
			if (square == num) {
				System.out.println(true);
				return;
			} else if (square > num) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		System.out.println(false);

	}

}

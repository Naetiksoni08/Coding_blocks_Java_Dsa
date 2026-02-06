package blind_45_days_sheet;

public class Guess_number_higher_or_lower_1 {
	public static void main(String[] args) {
		int n = 10;
		int pick = 6;
		System.out.println(Binarysearch(n));

	}

	public static int Binarysearch(int n) {
		int low = 1;
		int high = n;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			int ans = guess(mid);
			if (ans == 0) {
				return mid; // Found the number
			} else if (ans == -1) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	private static int guess(int mid) {
		// TODO Auto-generated method stub
		return 0;
	}

}

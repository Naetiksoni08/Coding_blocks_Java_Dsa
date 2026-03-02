package blind_45_days_sheet;

public class sqrt_of_x {
	public static void main(String[] args) {
		int x = 2;
		int low = 0;
		int high = x;
		int ans = 0;
		if (x < 2) {
			System.out.println(x);
		}
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (mid <= x / mid) { // mid² == x mid² < x handles both the condition < and = both 
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		System.out.println(ans);
	}
}

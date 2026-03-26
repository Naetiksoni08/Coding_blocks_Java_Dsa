package blind_45_days_sheet;

public class longest_alternating_subaarray {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 3, 4 };
		int len = 1;
		int ans = -1;
		for (int i = 0; i < arr.length - 1; i++) {
			int diff = arr[i + 1] - arr[i];
			if (diff == 1 && len % 2 == 1) {
				len++; // odd position par +1 hoga paaka
			} else if (diff == -1 && len % 2 == 0) {
				len++; // even position par -1 hoga paaka
			} else {
				ans = Math.max(ans, len);
				len = 1;
				if (diff == 1)
					len = 2;
			}
			ans = Math.max(ans, len);

		}
		System.out.println(ans >= 2 ? ans : -1);
	}

}

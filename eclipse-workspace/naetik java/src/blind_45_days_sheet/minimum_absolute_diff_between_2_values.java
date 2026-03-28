package blind_45_days_sheet;

public class minimum_absolute_diff_between_2_values {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 2, 0, 1 };
		int ans = Integer.MAX_VALUE;
		int last1 = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				last1 = i;
			} else if (arr[i] == 2) {
				if (last1 != -1) {
					ans = Math.min(ans, Math.abs(last1 - i)); // correct
				}
			}

		}
		last1 = -1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == 1) {
				last1 = i;
			} else if (arr[i] == 2) {
				if (last1 != -1) {
					ans = Math.min(ans, Math.abs(last1 - i)); // correct
				}
			}
		}
		System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
	}

}

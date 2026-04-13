package blind_45_days_sheet;

public class minimum_distance_between_3_equal_elements_1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 1, 3 };
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] == arr[j] && arr[j] == arr[k]) {
						int dist = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
						ans = Math.min(ans, dist);

					}
				}
			}
		}
		System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
	}

}

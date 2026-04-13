package blind_45_days_sheet;

public class minimum_distance_to_target_element {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int start = 3;
		int target = 5;
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				int min = Math.abs(start - i);
				ans = Math.min(ans, min);
			}
		}
		System.out.println(ans);
	}

}

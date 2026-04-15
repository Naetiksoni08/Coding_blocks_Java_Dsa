package blind_45_days_sheet;

public class shortest_distance_to_target_string_in_a_circular_array {

	public static void main(String[] args) {
		String[] words = { "hello", "i", "am", "leetcode", "hello" };
		String target = "hello";
		int startindex = 1;
		int ans = Integer.MAX_VALUE;
		int n = words.length;
		for (int i = 0; i < n; i++) {
			if (words[i].equals(target)) {
				int right = Math.abs(i - startindex);
				int left = n - right;
				ans = Math.min(ans, Math.min(right, left));

			}

		}
		System.out.println(ans == Integer.MIN_VALUE ? -1 : ans);

	}

}

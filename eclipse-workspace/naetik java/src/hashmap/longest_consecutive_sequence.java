package hashmap;

import java.util.HashSet;

public class longest_consecutive_sequence {

	public static void main(String[] args) {
		int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		System.out.println(longest_consecutive_sequence(arr));

	}

	public static int longest_consecutive_sequence(int[] arr) {
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i]) && !set.contains(arr[i] - 1)) {
				int count = 0;
				int v = arr[i];
				while (set.contains(v)) {
					set.remove(v);
					count++;
					v++;
				}
				ans = Math.max(ans, count);
			}
		}
		return ans;
	}

}

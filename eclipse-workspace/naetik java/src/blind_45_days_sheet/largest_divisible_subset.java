package blind_45_days_sheet;

import java.util.*;

public class largest_divisible_subset {
	static List<Integer> ans = new ArrayList<>();

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		Arrays.sort(arr);
		largest(arr, 0, -1, new ArrayList<>());
		System.out.println(ans);

	}

	public static void largest(int[] arr, int i, int j, List<Integer> ll) {
		if (i == arr.length) {
			if (ll.size() > ans.size()) {
				ans = new ArrayList<>(ll);
			}
			return;
		}
		if (j == -1 || arr[i] % arr[j] == 0) {
			ll.add(arr[i]);
			largest(arr, i + 1, i, ll);
			ll.remove(ll.size() - 1);
		}
		largest(arr, i + 1, j, ll);
	}

}

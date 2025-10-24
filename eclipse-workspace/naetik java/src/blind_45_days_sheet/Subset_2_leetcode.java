package blind_45_days_sheet;

import java.util.*;

public class Subset_2_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2 };
		Arrays.sort(arr);
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		subset(arr, 0, ll, ans);
		System.out.println(ans);

	}

	public static void subset(int[] arr, int i, List<Integer> ll, List<List<Integer>> ans) {
		ans.add(new ArrayList<>(ll));
		for (int j = i; j < arr.length; j++) { // jaise loop khatam hua vohi base case hoga
			if (j > i && arr[j] == arr[j - 1])
				continue;
			ll.add(arr[j]);
			subset(arr, j + 1, ll, ans);
			ll.remove(ll.size() - 1);

		}

	}
//	if (j > i && arr[j] == arr[j-1]) continue; this indrectly checks for exclude thing cuz we need to excude when i find a duplicate element
}

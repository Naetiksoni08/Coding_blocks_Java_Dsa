package blind_45_days_sheet;

import java.util.*;

public class subset_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2 };
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		subset(arr, 0, ll,ans);
		System.out.println(ans);

	}

	public static void subset(int[] arr, int i, List<Integer> ll, List<List<Integer>> ans) {
		if (i == arr.length) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		ll.add(arr[i]); // add the element
		subset(arr, i + 1, ll, ans); // number include karunga // inclusion
		ll.remove(ll.size() - 1); //backtrack
		subset(arr, i + 1, ll, ans); // ya number exclude karunga //exclusion

	}

}

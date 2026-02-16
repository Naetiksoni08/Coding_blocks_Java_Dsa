package blind_45_days_sheet;

import java.util.*;

public class merge_adjacent_equal_element {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 1, 2 };
		System.out.println(adjacent(arr));
		

	}

	public static List<Long> adjacent(int[] arr) {
		List<Long> ll = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			ll.add((long) arr[i]);
		}
		boolean merge = true;
		while (merge) {
			merge = false;
			for (int i = 0; i < ll.size() - 1; i++) {
				if (ll.get(i).equals(ll.get(i + 1))) {
					long sum = ll.get(i) + ll.get(i + 1);
					ll.set(i, sum);
					ll.remove(i + 1);
					merge = true;
					break;

				}
			}
		}
		return ll;
	}

}// this will give tle

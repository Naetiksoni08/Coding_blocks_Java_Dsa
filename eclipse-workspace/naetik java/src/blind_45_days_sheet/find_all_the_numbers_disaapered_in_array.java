package blind_45_days_sheet;

import java.util.*;

public class find_all_the_numbers_disaapered_in_array {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		HashSet<Integer> visited = new HashSet<>();
		for (int num : arr) {
			visited.add(num);
		}
		List<Integer> result = new ArrayList<>();
		for (int i = 1; i <= arr.length; i++) {
			if (!visited.contains(i)) {
				result.add(i);
			}
		}
		System.out.println(result);

	}

}

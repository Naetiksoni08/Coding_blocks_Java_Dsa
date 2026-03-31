package blind_45_days_sheet;

import java.util.*;

public class sum_of_sortable_integer {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2 };
		int n = arr.length;
		List<Integer> divisors = new ArrayList<>();
		int limit = (int) Math.sqrt(n);
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				divisors.add(i);

				if (i != n / i) {
					divisors.add(n / i);
				}
			}

		}

		int sum = 0;
		for (int k : divisors) {
			List<List<Integer>> groupNums = new ArrayList<>();
			List<List<Integer>> groupSorted = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int group = i % k;
				groupNums.add(new ArrayList<>());
				groupSorted.add(new ArrayList<>());

			}
			boolean valid = true;
			for (int i = 0; i < k; i++) {
				Collections.sort(groupNums.get(i));
				Collections.sort(groupSorted.get(i));

				if (groupNums.get(i).equals(groupSorted.get(i))) {
					valid = false;
					break;

				}

			}
			if (valid) {
				sum += k;

			}
			System.out.println(sum);

		}

	}
}

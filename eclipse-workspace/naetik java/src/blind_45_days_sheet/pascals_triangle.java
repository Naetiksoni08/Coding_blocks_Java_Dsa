package blind_45_days_sheet;

import java.util.*;

import java.util.Arrays;

public class pascals_triangle {

	public static void main(String[] args) {
		int rows = 5;
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < rows; i++) {
			Integer[] row = new Integer[i + 1];
			Arrays.fill(row, 1);
			for (int j = 1; j < i; j++) {
				row[j] = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);

			}

			result.add(Arrays.asList(row));
		}
		System.out.println(result);
	}

}

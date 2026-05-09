package blind_45_days_sheet;

import java.util.*;

public class contains_duplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1 };
		HashSet<Integer> set = new HashSet<>();
		for (int num : arr) {
			if (set.contains(num))
				System.out.println(true);
			set.add(num);
		}
		System.out.println(false);
	}

}

package blind_45_days_sheet;

import java.util.*;

public class minimum_operations_to_reach_target_array {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		int[] target = { 2, 1, 3 };

		Set<Integer> needOperation = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != target[i]) {
				needOperation.add(nums[i]);
			}
		}

		System.out.println(needOperation.size());
	}
}
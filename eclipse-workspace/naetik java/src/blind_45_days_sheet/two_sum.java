package blind_45_days_sheet;

import java.util.*;

public class two_sum {
//	class Solution {
//		public int[] twoSum(int[] arr, int target) {
//			for (int i = 0; i < arr.length; i++) {
//				for (int j = i + 1; j < arr.length; j++) {
//					if (arr[i] + arr[j] == target) {
//						return new int[] { i, j };
//					}
//				}
//			}
//			return new int[] {};
//
//		}
//	} // tc - o of n sqaure
//	
//	
//
//}
	class Solution {
		public int[] twoSum(int[] nums, int target) {
			HashMap<Integer, Integer> map = new HashMap<>(); // number ke corresponding index
			for (int i = 0; i < nums.length; i++) {
				int remaining = target - nums[i];

				if (map.containsKey(remaining)) {
					return new int[] { map.get(remaining), i }; // 0,1 returns 
				}
				map.put(nums[i], i);

			}
			return new int[] {}; // return empty integer array

		} // order of n optimized

	}

}

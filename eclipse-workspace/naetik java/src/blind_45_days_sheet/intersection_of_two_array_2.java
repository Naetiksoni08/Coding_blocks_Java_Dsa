package blind_45_days_sheet;

import java.util.*;

public class intersection_of_two_array_2 {
	class Solution {
		public int[] intersect(int[] arr1, int[] arr2) { 
			
			// frequency calculation
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < arr1.length; i++) {
				if (!map.containsKey(arr1[i])) {
					map.put(arr1[i], 1);
				} else {
					map.put(arr1[i], map.get(arr1[i]) + 1);
				}

			}
			// common elements in both the array
			List<Integer> ll = new ArrayList<>();
			for (int i = 0; i < arr2.length; i++) {
				if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) { // if present hai map mai toh ok but sath ke sath uski value hsould be greater than 0 
					ll.add(arr2[i]);
					map.put(arr2[i], map.get(arr2[i]) - 1);
				}
			}
			// final ans
			int[] ans = new int[ll.size()];
			for (int i = 0; i < ans.length; i++) {
				ans[i] = ll.get(i);
			}
			return ans;
			
		}

	} // 3n  = order of n 

}

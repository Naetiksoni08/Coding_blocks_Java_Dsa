package blind_45_days_sheet;

import java.util.*;

public class count_elements_with_maximum_frequency {

	class Solution {
		public int maxFrequencyElements(int[] arr) {

			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < arr.length; i++) {
				if (!map.containsKey(arr[i])) {
					map.put(arr[i], 1);
				} else {
					map.put(arr[i], map.get(arr[i]) + 1);
				}
			}
			int count = 0;
			for(int a:map.values()) {
				count = Math.max(a, count);
			}
			
			int result = 0;
			for(int f:map.values()) {
				if(f==count) {
					result+=f;
				}
			}
			return result;
			

		}
	}//order of n 

}

package blind_45_days_sheet;

import java.util.*;

public class minimum_number_of_operations_have_a_distinct_arr {
//	class Solution {
//		public int minOperations(int[] arr) {
//			int n = arr.length;
//			int count = 0;
//			int i = 0;
//			while (i < n) {
//				HashSet<Integer> set = new HashSet<>();
//				boolean hasduplicate = false;
//
//				for (int j = i; j < n; j++) {
//					if (!set.add(arr[j])) {
//						hasduplicate = true;
//						break;
//					}
//				}
//				if(!hasduplicate) {
//					return count;
//				}
//				count++;
//				i+=3;
//			}
//			return count;
//
//		}
//	}
	
	//optimized
	class Solution {
	    public int minOperations(int[] nums) {
	        int n = nums.length;
	        HashSet<Integer> set = new HashSet<>();

	        int lastDuplicateIndex = -1;
	        for (int i = n - 1; i >= 0; i--) {
	            if (set.contains(nums[i])) {
	                lastDuplicateIndex = i;
	                break;
	            }
	            set.add(nums[i]);
	        }
	        if (lastDuplicateIndex == -1) {
	            return 0;
	        }
	        return (lastDuplicateIndex / 3) + 1;
	    }
	}

}

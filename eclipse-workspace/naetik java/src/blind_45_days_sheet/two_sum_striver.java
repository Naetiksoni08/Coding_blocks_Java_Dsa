package blind_45_days_sheet;

import java.util.*;

public class two_sum_striver {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 9;
		HashMap<Integer, Integer> map = new HashMap<>(); // we will store value ke corresponding index so 2-0 , 7-1 11-2
															// 15-3
		for (int i = 0; i < arr.length; i++) {
			int remaining = target - arr[i]; // remaining baar baar new banta hai because it is inside the for loop

			if (map.containsKey(remaining)) {
//				return new int[] { map.get(remaining), i }; // remaining sai hume index milega aur i toh hai hi 
			}
			map.put(arr[i], i);
		}
//		return new int[] {};

	}

}

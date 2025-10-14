package blind_45_days_sheet;

import java.util.*;

public class Subarray_sum_equal_to_k_for_negative_arrays {

	public static void main(String[] args) {
		int[] arr = { 2,-1,2 };
		int k = 3;
		System.out.println(subarray(arr, k));
	}

	public static int subarray(int[] arr, int k) {
		int sum = 0;
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1); // 0 represents the prefix sum and 1 represents how many times we have seen 0 as
						// a prefix sum basically counts its frequency

		for (int a : arr) {
			sum += a;

			if (map.containsKey(sum - k)) { // agar humnai phele yeh wala sum dekha hua hai toh uski joh frequency hai
											// usse count mai daaldo
				count += map.get(sum - k);
			}
			if (map.containsKey(sum)) { // if sum exists 
			    map.put(sum, map.get(sum) + 1); //then purni frequency get karo aur usmai +1 karke daldo
			} else {
			    map.put(sum, 1); // if not then 1 daldo frequency bas
			}

		}
		return count;
	}
}



// get or default -- If the map contains the key, it returns the value associated with that key.
//If the map does NOT contain the key, it returns the defaultValue you provide.
//example
//map.put("apple", 5);
//System.out.println(map.getOrDefault("apple", 0));  // Output: 5
//System.out.println(map.getOrDefault("banana", 0)); // Output: 0 (because "banana" is not in map)


//map.put(sum, map.getOrDefault(sum, 0) + 1);
// if we havent seen this sum earlier yani naya sum hai toh hume isse add karna padega so sum represents the prefix sum and uske correcponding uss sum ki frequency..
//If we’ve seen this sum before, it gives the current frequency.
//If we haven’t seen it before, default = 0.
//+1 → increment the frequency by 1 (because we just encountered this sum now).

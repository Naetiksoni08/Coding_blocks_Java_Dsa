package blind_45_days_sheet;

import java.util.*;

public class contains_duplicates_2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1 };
		int k = 3;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				if (i - map.get(arr[i]) <= k) { // 3-map.get(1) will return last seen index ie 0 so 3-0<=3 true
					System.out.println(true);
					return;
				}
			}
			map.put(arr[i], i); // update the last scene index for that element 
		}
		System.out.println(false);

	}

}

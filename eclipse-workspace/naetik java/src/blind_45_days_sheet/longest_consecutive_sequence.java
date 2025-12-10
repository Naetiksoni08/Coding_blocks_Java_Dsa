package blind_45_days_sheet;

import java.util.*;

public class longest_consecutive_sequence {

	class Solution { // concept is ki agar map mai phele sai 1 hai toh 2 uss 1 wale sequence ka part
						// banega lekin agar map mai 1 nai hai toh 2 sequence ka start banega 2 ko
						// daldene ka baad 3 ko check karo hai ya nai agar hai toh 3 ko false ki tarah
						// daldo kyuki voh 2 ka part banega sojaise 3 ke liye hum 2 aur 4 check karenge
		public int longestConsecutive(int[] arr) {
			Map<Integer, Boolean> map = new HashMap<>();
			for (int i = 0; i < arr.length; i++) {
				if (map.containsKey(arr[i] - 1)) {
					map.put(arr[i], false);
				} else {
					map.put(arr[i], true);
				}
				if (map.containsKey(arr[i] + 1)) {
					map.put(arr[i] + 1, false);
				}
			}
			int ans = 0;
			for (int key : map.keySet()) {
				if (map.get(key) == true) { // jis number ke corresponding true hai ussi number ke liye further calculate karenge 
					int count = 0;
					while (map.containsKey(key)) { 
						count++;
						key++;
					}
					ans = Math.max(ans, count);
				}

			}
			return ans;
		}
	} // tc order of n not n2 this while loop will only and only run when the value is true otherwise it wont 
}

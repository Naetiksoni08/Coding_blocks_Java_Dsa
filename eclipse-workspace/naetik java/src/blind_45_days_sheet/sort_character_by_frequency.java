package blind_45_days_sheet;

import java.util.*;

public class sort_character_by_frequency {

	class Solution {
		public String frequencySort(String s) {
			Map<Character, Integer> map = new HashMap<>();
			// calculte frequency 
			for (char ch : s.toCharArray()) {
				if (!map.containsKey(ch)) {
					map.put(ch, 1);
				} else {
					map.put(ch, map.get(ch) + 1);
				}
			}
			//sort in decreasing order in the priority queue
			PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a)); // decreasing order

			pq.addAll(map.keySet());
 // append the character in the string
			StringBuilder sb = new StringBuilder();
			while (!pq.isEmpty()) { // jab tk empty na ho jaye
				char c = pq.poll(); // poll it 
				sb.append(String.valueOf(c).repeat(map.get(c))); // append and convert karo value of c ko in string  aur agar repeated freq bhi ho toh usse bhi get karo aur append karu
			}
			return sb.toString();// convert it into string

		}

	}
     //string.value of converts the character into string
	// .repeat() If freq = 3, "e".repeat(3) → "eee".
}

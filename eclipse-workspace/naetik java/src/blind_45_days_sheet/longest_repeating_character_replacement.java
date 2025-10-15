package blind_45_days_sheet;

import java.util.*;

public class longest_repeating_character_replacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AABABBA";
		int k = 1;
		System.out.println(longest(str, k));

	}

	public static int longest(String str, int k) {
		int si = 0;
		int ei = 0;
		int maxlen = 0;
		int maxFreq = 0;    
		HashMap<Character, Integer> map = new HashMap<>();

		while (ei < str.length()) {
			char ch = str.charAt(ei);
			
			if (map.containsKey(ch)) {
			    map.put(ch, map.get(ch) + 1);
			} else {
			    map.put(ch, 1);
			}
//			map.put(ch, map.getOrDefault(ch, 0) + 1); 
//			“Agar ch map mein hai toh uski value ko 1 se badha do, warna 0 samajh ke usme(0+1) 1 daal do.”
			
			maxFreq = Math.max(maxFreq, map.get(ch));

			while ((ei - si + 1) - maxFreq > k) {
				char leftchar = str.charAt(si);
				map.put(leftchar, map.get(leftchar) - 1);
				si++;

			}

			maxlen = Math.max(maxlen, ei - si + 1);
			ei++;

		}
		return maxlen;
	}
}


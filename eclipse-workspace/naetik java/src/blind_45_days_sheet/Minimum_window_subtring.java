package blind_45_days_sheet;

import java.util.*;

public class Minimum_window_subtring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ADOBECODEBANC";
		String t1 = "ABC";
		System.out.println(minimum_window(str, t1));

	}

	public static String minimum_window(String str, String t2) {
		
		HashMap<Character, Integer> needfreq = new HashMap<>();
		
		for (char ch : t2.toCharArray()) {
			if (!needfreq.containsKey(ch)) {
				needfreq.put(ch, 1);
			} else {
				needfreq.put(ch, needfreq.get(ch) + 1);
			}
		}

			int si = 0;
			int ei = 0;
			int minlen = Integer.MAX_VALUE;
			int havecount = 0;
			int needcount = t2.length();
			int start = 0;
			
			HashMap<Character, Integer> window = new HashMap<>();

			while (ei < str.length()) {
				char ch1 = str.charAt(ei);
				if (!window.containsKey(ch1)) {
					window.put(ch1, 1);
				} else {
					window.put(ch1, window.get(ch1) + 1);
				}

				if (needfreq.containsKey(ch1) && window.get(ch1) <= needfreq.get(ch1)) {
					havecount++;
				}

				// shrink

				while (havecount == needcount) {
					if (ei - si + 1 < minlen) {
						minlen = ei - si + 1;
						start = si;
					}
					
					char ch2 = str.charAt(si);
					window.put(ch2, window.get(ch2) - 1);
					if (needfreq.containsKey(ch2) && window.get(ch2) < needfreq.get(ch2)) {
						havecount--;
					}
					si++;

				}
				ei++;

			}
			return (minlen == Integer.MAX_VALUE) ? "" : str.substring(start, start + minlen);

		}
		
		
	}

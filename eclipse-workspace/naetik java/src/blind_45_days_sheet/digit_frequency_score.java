package blind_45_days_sheet;

import java.util.*;

public class digit_frequency_score {

	public static void main(String[] args) {
		int n = 122;
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		while (n > 0) {
			int digit = n % 10;
			if (!map.containsKey(digit)) {
				map.put(digit, 1);
			} else {
				map.put(digit, map.get(digit) + 1);
			}
			n /= 10;
		}
		for(int digit:map.keySet()) {
			sum+=digit*map.get(digit); // keyset ke naam par 2 and 1 ayega so phele manle 2 aya fir sum+=2*map.get(2) ki fre 2 aai so 2*2 = 4 then 1 ayega 1*map.get1 = 1*1 = 1 = 4+1 = 5
		}
		System.out.println(sum);
	}

}

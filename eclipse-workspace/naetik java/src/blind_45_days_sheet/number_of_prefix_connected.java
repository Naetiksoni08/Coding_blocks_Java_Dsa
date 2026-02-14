package blind_45_days_sheet;

import java.util.*;

public class number_of_prefix_connected {

	public static void main(String[] args) {
		String[] str = { "apple", "apply", "banana", "bandit" };
		int k = 2;
		System.out.println(prefix(str, k));
	}

	public static int prefix(String[] arr, int k) {
		HashMap<String, Integer> map = new HashMap<>();
		for (String s : arr) {
			if (s.length() < k) {
				continue;
			}
			String prefix = s.substring(0, k);

			if (!map.containsKey(prefix)) {
				map.put(prefix, 1);
			} else {
				map.put(prefix, map.get(prefix) + 1);
			}

		}
		int result=0;
		for (int val : map.values()) {
			if(val>=2) {
				result++;
			}
		}
		return result;

	}

}

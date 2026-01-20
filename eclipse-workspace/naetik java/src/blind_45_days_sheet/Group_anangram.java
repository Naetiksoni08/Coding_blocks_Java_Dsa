package blind_45_days_sheet;

import java.util.*;

public class Group_anangram {

	public static void main(String[] strs) {
		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(Anagrams(strs));

	}

	public static List<List<String>> Anagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			String key = key(strs[i]);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());

			}
			map.get(key).add(strs[i]);

		}
		List<List<String>> ans = new ArrayList<>();
		for (String key : map.keySet()) {
			ans.add(map.get(key));
		}
		return ans;
	}

	public static String key(String s) {
		int[] freqarr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int idx = s.charAt(i) - 'a';
			freqarr[idx] = freqarr[idx] + 1;

		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < freqarr.length; i++) {
			sb.append(freqarr[i]+" ");
		}
		return sb.toString();
	}
}

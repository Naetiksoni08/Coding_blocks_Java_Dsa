package blind_45_days_sheet;

import java.util.*;

public class toggle_light_bulbs {

	class Solution {
		public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
			List<Integer> ans = new ArrayList<>();
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < bulbs.size(); i++) {
				if (set.contains(bulbs.get(i))) {
					set.remove(bulbs.get(i));
					ans.remove(Integer.valueOf(bulbs.get(i)));
				} else {
					set.add(bulbs.get(i));
					ans.add(bulbs.get(i));
				}
			}
			Collections.sort(ans);
			return ans;
		}

	}
}

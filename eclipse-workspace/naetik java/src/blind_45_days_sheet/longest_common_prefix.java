package blind_45_days_sheet;

public class longest_common_prefix {
	class Solution {
		public String longestCommonPrefix(String[] strs) {
			if (strs == null || strs.length == 0) {
				return "";
			}
			String first = strs[0];
			for (int i = 0; i < first.length(); i++) {
				char ch = first.charAt(i);
				for (int j = 1; j < strs.length; j++) {
					if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
						return first.substring(0, i);
					}
				}
			}
			return first;

		}
	}

}

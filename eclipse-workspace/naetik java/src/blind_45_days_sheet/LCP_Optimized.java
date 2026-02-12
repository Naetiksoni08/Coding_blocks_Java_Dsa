package blind_45_days_sheet;

public class LCP_Optimized {

	class Solution {
		public String longestCommonPrefix(String[] strs) {
			if (strs == null || strs.length == 0) {
				return "";

			}
			for (int i = 0; i < strs[0].length(); i++) { // loop over flower first
				char ch = strs[0].charAt(i); // f milega compare f with all strings
				for (int j = 1; j < strs.length; j++) {
					if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
						return strs[0].substring(0, i); // we are only calculating string[0] ka substring kyuki hum
						// refernce leh rahe hai flower ko
					} // return flower.substring(0,2) so fl ek kam uk
				}
			}
			return strs[0];

		}

	}
	// simply first condition is easy that i which is the flower wali string ka idx
	// should always be greater than flow and flight wali string theke ab next dekh
	// we are saying j is for flower,flow,flight (0,1,2 idx) so strs[j] ie
	// flow.charat(i) that is f if f!=f then simply return substring
}

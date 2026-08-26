package blind_45_days_sheet;

import java.util.*;

public class find_all_numbers_disappeared_in_an_array_2 {

	public static void main(String[] args) {
		int[] arr = { 3, 9, 7 };
		int lower = 1, upper = 12;
		HashSet<Integer> set = new HashSet<>();
		for (int n : arr) {
			set.add(n);
		}
		List<Integer> ans = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();

		for (int i = lower; i <= upper; i++) {
			if (!set.contains(i)) {
				ans.add(i);
			} else { // if set contains yani 3 hai array mai toh fir range ko close karo
				if (!ans.isEmpty()) { // if empty nai hai toh empty karo aur range close karo
					result.add(Arrays.asList(ans.get(0), ans.get(ans.size() - 1)));
					ans.clear();
				}
			}

		}
		if (!ans.isEmpty()) {
			result.add(Arrays.asList(ans.get(0), ans.get(ans.size() - 1)));
		}
		System.out.println(result);

	}

}

//Loop ke baad final check — agar loop khatam hote waqt bhi ans mein kuch bacha hai (matlab last range close nahi hui), use bhi result mein daal do

package blind_45_days_sheet;

import java.util.*;

public class minimum_string_length_after_balanced_removal {

	public static void main(String[] args) {
		int n = 10;
		HashSet<Long> set = new HashSet<>();
		solve(n, 0, set);
		System.out.println(set.size());

	}

	public static void solve(int n, long currenNum, HashSet<Long> set) {
		if (currenNum > n) { // Base case: agar current number n se bada ho gaya, return
			return;
		}
		if (currenNum > 0) {
			set.add(currenNum);
		}
		for (int digit = 1; digit <= 9; digit++) {
			long newnumber = currenNum * 10 + digit;

			if (newnumber <= n) {
				solve(n, newnumber, set);
			}

		}
	}

}

package blind_45_days_sheet;

import java.util.*;

public class check_if_array_is_good {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 3 };
		HashMap<Integer, Integer> map = new HashMap<>();
		int n = 0;
		for (int a : arr) {
			n = Math.max(n, a);
		}
		if (arr.length != n + 1)
			System.out.println(false); // if not equal then return false yahi sai
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (int i = 1; i <= n - 1; i++) { // 1 sai n-1 tk 1 hi freq honi chahiye sabhi element ki 
			if (map.getOrDefault(i, 0) != 1)
				System.out.println(false);
		}
		if (map.getOrDefault(n, 0) != 2) // n ki freq 2 honi chahiye
			System.out.println(false);

		System.out.println(true);
	}

}
// map.getordefault basically do is ki agar map mai lets say 3 present hai toh phir toh uski value return kardo that is uski frequency in the map if nai hai toh fir default value return karo 
// 3 condition thi ek toh ki arr.length ki value n+1 ke equal honi chahiye 
// 1 sai n-1 tk element ki freq 1 hi honi chahiye
// n ki frequency 2 honi chahiye 
// time complextiy order of n and space is order of 1 
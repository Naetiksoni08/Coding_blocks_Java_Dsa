package blind_45_days_sheet;

import java.util.*;

public class smallet_missing_multiple_of_k_anotherApproach{
	public static void main(String[] args) {
		int[] arr = { 8, 2, 3, 4, 6 };
		int k = 2;
		int i = 1;
		Set<Integer> set = new HashSet<>();
		for (int n : arr) {
			set.add(n);
		}
		while (set.contains(k * i)) { // set contain 2 ,4,6,8,10? no
			i++;

		}
		System.out.println(k * i); // 10
	}

}

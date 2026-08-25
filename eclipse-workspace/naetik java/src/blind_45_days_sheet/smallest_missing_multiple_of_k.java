package blind_45_days_sheet;

import java.util.*;

public class smallest_missing_multiple_of_k {
	public static void main(String[] args) {
		int[] arr = { 8, 2, 3, 4, 6 };
		int k = 2;
		int min = Integer.MAX_VALUE;
		Set<Integer> set = new HashSet<>();
		for (int n : arr) {
			set.add(n);
		}
		for (int i = 1; i <= arr.length+1; i++) { // worst case par missing multiple will be on arr.len+1 index 
			if (!set.contains(k * i)) { // example arr = {99} and k = 99 so i = 1 sai arr.length 1 yani 1 sai 1 tk chalega loop ek bari so 99*1  = 99 and loop khatam but this is not the answer answer is at i = 2 99*2 = 198 so this is the pingenhole principle that worst case mai missing multiple will be on arr.length+1
				min = Math.min(min, k*i);
				break;
			}
		}
		System.out.println(min);

	}
}

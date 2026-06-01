package blind_45_days_sheet;

import java.util.*;

public class find_the_length_of_the_longest_common_prefix {

	public static void main(String[] args) {
		int[] arr1 = { 1, 10, 100 };
		int[] arr2 = { 1000 };
		HashSet<Integer> set = new HashSet<>();
		for (int num : arr1) {
			while (num > 0) {
				set.add(num); // add all the prefix of the element of arr1 say 100 so 100 add karo 10 add karo
								// fir 1 add karo
				num /= 10;
			}
		}
		int max = 0;
		for (int num : arr2) {
			while (num > 0) {
				if (set.contains(num)) {
					max = Math.max(max, String.valueOf(num).length());
					break;
				}
				num /= 10; // check all the prefix in arr2
			}
		}
		System.out.println(max);

	}

}

//
//arr1 = [1, 10, 100]
//
//num=1   → add 1        → set={1}
//num=10  → add 10,1     → set={1,10}
//num=100 → add 100,10,1 → set={1,10,100}
//
//arr2 = [1000]
//num=1000 → set mein? 
//num=100  → set mein?  → length=3, break!
//
//max = 3 ✓

//breakdown of this line  num=100 and max=0
//String.valueOf(num)        →  "100"      (int to String convert)
//"100".length()             →   3         (string ki length = digits count)
//Math.max(0, 3)             →   3         (purana max vs naya)
//max = 3

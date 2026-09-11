package blind_45_days_sheet;

import java.util.*;

public class unique_3_digits_even_number {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		Set<Integer> set = new HashSet<>();
		int n = arr.length;
		for (int i = 0; i < n; i++) { // For hundreds
			if (arr[i] == 0)
				continue;
			for (int j = 0; j < arr.length; j++) {// For tens
				if (i == j) {
					continue;
				}
				for (int k = 0; k < arr.length; k++) { // For unit digit
					if (i == k || j == k)
						continue; // The indexes should not be the same
					if (arr[k] % 2 != 0)
						continue; // Last digit must be even

					int num = arr[i] * 100 + arr[j] * 10 + arr[k];
					set.add(num); // This ensures that no unique numbers are formed
				}
			}

		}
		System.out.println(set.size()); // This set is acting like a count variable for us and it also ensures that no
										// unique element or new unique number is formed
	}
}
//The constraints were very small so we tried brute force by checking all the possibilities. That's it Also we are here tracking the indexes rather than the value so keep that in mind 
//A small dry run. Let's say that the indices that we got were 0, 1, and 2, respectively, i, j, and k. Now when it comes to forming the number, we are just multiplying 1 × 100 + 2 × 10 + 4, which is k, and the number becomes 124. Just like that we are just calculating each number and And we can say that, as you can see, the array consists of only two unique elements, which are at index 1 and index 3 So we can say that we are going to keep those unique elements at the end because then only the number will be formed uniquely, right? If the unit digit (that is, the kth loop) will consist of a unique number, then only the whole number will become unique. We will try all the possibilities of keeping the value of index 1 and the value of index 3, which are 2 and 4, respectively, at the end of the number 
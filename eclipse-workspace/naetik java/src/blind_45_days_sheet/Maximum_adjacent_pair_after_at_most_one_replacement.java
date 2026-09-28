package blind_45_days_sheet;

import java.util.*;

public class Maximum_adjacent_pair_after_at_most_one_replacement {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 4, 5, 7, 7 };
		HashMap<String, Integer> map = new HashMap<>();
		int basepair = 0; // equal wale count karo
		int bestgain = 0;
		for (int i = 0; i < arr.length - 1; i++) { // If the length of the array is n, then there will be n - 1 pairs
			int a = arr[i];
			int b = arr[i + 1];
			if (a == b) {
				basepair++;
			} else {
				String key = Math.min(a, b) + "," + Math.max(a, b); // 4,5
				int count = map.getOrDefault(key, 0) + 1;
				map.put(key, count);
				bestgain = Math.max(bestgain, count);
			}
		}
		System.out.println(bestgain + basepair);

	}

}

// The reason why we made a key was that you understand the concept of base. Base is basically the pair which is already equal, right? For example in this case, 454577, the 77 is already a pair where A and B both are equal so the base becomes 1 in this case, right?
// Now the other pairs are 45, 54, 45, and 57. This 45, 54, 45 needs to be counted as 1 pair only. What we will do is make a key with a minimum of 45 because we want 45 and 4, 5, 4, 5 to be 1 pair only. We are generalizing it as 45 only, right? The minimum of 45 becomes 4,
//and the maximum of 5445 becomes 5. 4, 5 will be the pair and we are just storing that in the hash map against the count of that particular pair and that's it 

//	Pair	a==b?	key	map after	bestGain
//			(4,5)	nahi	"4,5"	{"4,5":1}	1
//			(5,4)	nahi	"4,5"	{"4,5":2}	2
//			(4,5)	nahi	"4,5"	{"4,5":3}	3
//			(5,7)	nahi	"5,7"	{"4,5":3, "5,7":1}	3
//			(7,7)	haan		base = 1	3
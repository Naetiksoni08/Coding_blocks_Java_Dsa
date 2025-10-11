package blind_45_days_sheet;

import java.util.*;

public class Day_at_the_beach_code_forces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(day_at_the_beach(arr));

	}

	public static int day_at_the_beach(int[] arr) {
		int[] sortedarr = arr.clone(); // clone makes a new array and copy all the elements
		Arrays.sort(sortedarr);

		Map<Integer, Integer> freqA = new HashMap<>(); // arr
		Map<Integer, Integer> freqB = new HashMap<>(); // sorted arr

		int block = 0;
		for (int i = 0; i < sortedarr.length; i++) {
			if (freqA.containsKey(arr[i])) { // if contain kar ta hai toh kya kar purani value ko get kar aur +1 karde

				freqA.put(arr[i], freqA.get(arr[i]) + 1); // freqA wale map mai put karo arr of i ke samnai but phele
															// purane wali value ko get karo aur usmai +1 karke daldo
			} else {
				freqA.put(arr[i], 1);
			}
			if (freqB.containsKey(sortedarr[i])) {
				freqB.put(arr[i], freqB.get(sortedarr[i]) + 1);

			} else {
				freqB.put(sortedarr[i], 1);
			}
			if (freqA.equals(freqB)) { // equals Checks whether the counts of elements in the prefix of the original
										// array (arr) exactly match the counts in the prefix of the sorted array
										// (sortedArr) so far.
				block++;
				freqA.clear();// All entries in the map are removed..The map becomes empty, as if it was just
								// created
				freqB.clear();

			}
		}
		return block;

	} // tc - O(nlogn)​
	 // sc - O(n)

} // this problem is the same like subsegment sort from code skiller and this problem is very common in competitve programming 

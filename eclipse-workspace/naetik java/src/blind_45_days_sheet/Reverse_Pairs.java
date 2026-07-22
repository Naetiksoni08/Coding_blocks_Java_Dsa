package blind_45_days_sheet;

public class Reverse_Pairs {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 2, 3, 1 };
		System.out.println(reversePairs(nums));
	}

	public static int reversePairs(int[] nums) {
		int[] temp = new int[nums.length]; // temp banane ka reason yeh tha ki bhai temp is a temporary array ab mai
											// directly nums mai toh joh 2 halves hai left and right unko copy nai kar
											// sakta na element overwrite ho jayenge so seedhi baat hai phele temp mai
											// copy karlo fir uske baad nums mai add karo
		return mergeSort(nums, temp, 0, nums.length - 1);
	}

	private static int mergeSort(int[] nums, int[] temp, int left, int right) {
		if (left >= right) { // simple condition
			return 0;
		}
		int mid = left + (right - left) / 2; // mid nikala simple
		int leftpairs = mergeSort(nums, temp, left, mid); // left ke pair niklenge left sai mid ke beech mai
		int rightpairs = mergeSort(nums, temp, mid + 1, right); // right ke mid+1 sai right ke beech mai
		int crossPairs = countCrossPairs(nums, left, mid, right);
		merge(nums, temp, left, mid, right); // joh left aur right array hai unko merge bhi toh karna padega na
		return leftpairs + rightpairs + crossPairs;// at the end teeno ke pair individually calc hone ke baad return
													// karo teeno
	}

	private static int countCrossPairs(int[] nums, int left, int mid, int right) { // left mid mid+1 and right hai
																					// basically
		// dekh kuch aisa hoga left array hoga after division 2,3,4 aur rigth hoga 1,5
		// ab hum 2 ko 1 sai aur 5 sai 3 ko 1 sai aur 5 sai aur 4 ko 1 sai aur 5 sai
		// compare karna hai count karna hai if pair mile toh bas
		int count = 0;
		int j = mid + 1;
		for (int i = left; i <= mid; i++) {
			while (j <= right && (long) nums[i] > 2L * nums[j]) {
				j++;
			}
			count += j - (mid + 1);
		}
		return count;

	}

	private static void merge(int[] nums, int[] temp, int left, int mid, int right) {// yeh simply left halves aur right
																						// halves ko jodhne ke liye hai
																						// simply Do sorted halves ko
																						// merge karke ek sorted array
																						// banana.
		for (int i = left; i <= right; i++) {
			temp[i] = nums[i]; // copy all elements to temp first then temp par overwrite karo
		}
		int i = left;
		int j = mid + 1;
		int k = left;
		while (i <= mid && j <= right) {
			if (temp[i] <= temp[j]) { // agar left wala chota hai toh fir
				nums[k++] = temp[i++]; // left wale ko daldo nums mai aur i++ nd k++ karo
			} else {
				nums[k++] = temp[j++]; // if nai hai chota left wala toh right wale ko nums mai daldo j++ and k++
										// isliye k ko left sai initialize kia kyuki k is helping us to put our number
										// in nums
			}
		}
		while (i <= mid) { // remaining elements ko bhi daldo
			nums[k++] = temp[i++];
		}
		while (j <= right) { // remaining elements ko bhi daldo
			nums[k++] = temp[j++];
		}

	}

}

//
//nums = [2, 4, 3, 5, 1]
//
//Step 1: mergeSort(0, 4)
//        mid = 2
//        leftPairs = mergeSort(0, 2)   → [2, 4, 3]
//        rightPairs = mergeSort(3, 4)  → [5, 1]
//        
//        // Ab left [2,3,4] sorted, right [1,5] sorted
//        
//        crossPairs = countCross(0, 2, 4)
//            i=0 (2): 2 > 2*1? No, 2 > 2*5? No → j=3, count += 0
//            i=1 (3): 3 > 2*1? No, 3 > 2*5? No → j=3, count += 0  
//            i=2 (4): 4 > 2*1? Yes! j=4, 4 > 2*5? No → j=4, count += 1
//            crossPairs = 1
//            
//        merge(0, 2, 4) → [1, 2, 3, 4, 5]
//        
//        return leftPairs + rightPairs + crossPairs

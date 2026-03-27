package blind_45_days_sheet;

public class construct_uniform_parity_array_2 {

	public static boolean main(String[] args) {
		int[] arr1 = { 2, 3 };
		int min = Integer.MAX_VALUE;
		for (int arr : arr1) {
			min = Math.min(arr, min);
		}
		if (min % 2 == 0) {
			for (int arr : arr1) {
				if (arr % 2 == 1)
					return false;
			}
		}
		return true;
	}

}
// find min that will be fixed (usko change nai kar sakte) because nums1[i] - nums1[j] >= 1 that means Sirf tab subtract allowed hai jab i wala number bada ho j se ek 2,5,7 min = 2 can we subtract min with any other element -ve milega so bas 
// check if min is even if yes then check if any element is odd if found then false because we cannot convert odd to even
// if min = odd then simply retur true;

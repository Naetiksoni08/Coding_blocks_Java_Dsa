package blind_45_days_sheet;

import java.util.*;

public class split_the_array {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 2, 3, 3 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1); // agar element hai toh fir purana get karo aur +1 karke daal do
														// agar element nai hai toh fir 1 put karde
			if (map.get(num) >= 3)
				System.out.println(false);
		}
		System.out.println(true);
	}
}

// key observation was that ki koi bhi element 3 baar nai aah sakta  mtlb 1 1 1 kyuki 1 goes to num1 another 1 goes to num2 but last 1 kaha jayega kyuki distict element bhi hone chahiye array mai
//Element 1 teen baar aaya → [1,1,1,...]
//nums1 mein 1 daala → nums1 mein dobara nahi aa sakta (distinct!)
//nums2 mein 1 daala → nums2 mein dobara nahi aa sakta (distinct!)
//teesra 1 kahan jayega? → NOWHERE! → false
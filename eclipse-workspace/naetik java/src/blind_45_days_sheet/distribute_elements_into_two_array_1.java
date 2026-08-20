package blind_45_days_sheet;

import java.util.*;

public class distribute_elements_into_two_array_1 {

	public static void main(String[] args) {
		int[] num = { 2, 1, 3 };
		List<Integer> arr1 = new ArrayList<>();
		List<Integer> arr2 = new ArrayList<>();

		arr1.add(num[0]); // 2
		arr2.add(num[1]); // 1

		for (int i = 2; i < num.length; i++) { // 2 sai 3 ek hi baar chalega loop
			if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) { // arr1.get(1-1) yani 2 and arr2.get(1-1) = 1
																			// so 2>1
				arr1.add(num[i]); // 2 , 3
			} else {
				arr2.add(num[i]); // 1 , 3
			}
		}
		// arr1 = 2,3 arr2 = 1

		int[] result = new int[num.length]; // 3
		int i = 0;
		for (int n : arr1) { // 2 then 3
			result[i] = n; // result = [2,3]
			i++; // 2
		}
		for (int n : arr2) { // 1
			result[i] = n; // result[2] = 1
			i++; // 3
		} // 2,3,1

		System.out.println(result);

	}
 // order of n and order of n both time and space 
}

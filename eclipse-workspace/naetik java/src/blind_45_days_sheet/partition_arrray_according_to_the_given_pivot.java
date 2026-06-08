package blind_45_days_sheet;

import java.util.*;

public class partition_arrray_according_to_the_given_pivot {
	public static void main(String[] args) {
		int[] arr = { 9, 12, 5, 10, 14, 3, 10 };
		int pivot = 10;
		List<Integer> less = new ArrayList<>();
		List<Integer> equal = new ArrayList<>();
		List<Integer> greater = new ArrayList<>();
		for (int a : arr) {
			if (a < pivot) {
				less.add(a);
			} else if (a == pivot) {
				equal.add(a);
			} else {
				greater.add(a);
			}
		}
		int[] result = new int[arr.length];
		int i = 0;
		for (int num : less) {
			result[i++] = num;
		}
		for (int num : equal) {
			result[i++] = num;
		}
		for (int num : greater) {
			result[i++] = num;
		}
		System.out.println(result);

	} 
	
	//order of n 
}

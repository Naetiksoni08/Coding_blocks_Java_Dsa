package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class intersection_of_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };
		int[] result = intersection_of_two(nums1, nums2);

	}

	public static int[] intersection_of_two(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i]) + 1); // basically when we will get a duplicate element we will
														// increase the count by 1 so i+1 = 2

			} else {
				map.put(arr1[i], 1); // put 1 corresponding to there index basically count ++
			}

		}
		List<Integer> ll = new ArrayList<>();
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
				ll.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i]) - 1);

			}
		}
			int[] ans = new int[ll.size()];
			for(int i = 0 ; i <ans.length; i++) {
				ans[i] = ll.get(i);
			}
			return ans;

		}
		

	}



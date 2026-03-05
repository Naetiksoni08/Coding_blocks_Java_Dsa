package blind_45_days_sheet;

import java.util.*;

public class foursum {

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };
		int target = 0;
		List<List<Integer>> ll = new ArrayList<>();
		Arrays.sort(arr); // n log n
		for (int i = 0; i < arr.length - 3; i++) { // n
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < arr.length - 2; j++) {// n
				if (j > i + 1 && arr[j] == arr[j - 1])
					continue;
				int left = j + 1;
				int right = arr.length - 1;
				while (left < right) {// n
					long sum = (long) arr[i] + arr[j + 1] + arr[left] + arr[right];
					if (sum == target) {
						ll.add(Arrays.asList(arr[i], arr[j + 1], arr[left], arr[right]));
						while (left < right && arr[left] == arr[left + 1])
							left++;
						while (left < right && arr[right] == arr[right - 1])
							right--;
						left++;
						right--;
					} else if (sum > target) {
						right--;
					} else {
						left++;
					} // so tc is n log n+n3 = n3
				}
			}
		}
		System.out.println(ll);

	}

}
//In this question we are fixing two elements and the other two elements are handled by left and right pointers. There we are using a two-pointer approach. In total we have four elements: i, j, left, and right. That is why the first two elements, i and j, are so; that is why we need a jth loop so that the second element could vary 
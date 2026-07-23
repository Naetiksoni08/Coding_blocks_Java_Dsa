package blind_45_days_sheet;

import java.util.*;

public class foursum_striver {

	public static void main(String[] args) {
		int[] arr = { 1, 0, -1, 0, -2, 2 };
		int target = 0;
		List<List<Integer>> ll = new ArrayList<>();
		Arrays.sort(arr); // n log n
		for (int i = 0; i < arr.length - 3; i++) {
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < arr.length - 2; j++) {
				if (j > i+1 && arr[j] == arr[j - 1]) {
					continue;
				}
				int left = j + 1;
				int right = arr.length - 1;
				while (left < right) {
					long sum = (long) arr[i] + arr[j] + arr[left] + arr[right];
					if (sum == target) {
						ll.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
						while (left < right && arr[left] == arr[left + 1])
							left++;
						while (left < right && arr[right] == arr[right - 1])
							right--;
						left++;
						right--;
					}else if(sum>target) {
						right--;
					}else {
						left++;
					}
				}

			}

		}
		System.out.println(ll);
	}

}

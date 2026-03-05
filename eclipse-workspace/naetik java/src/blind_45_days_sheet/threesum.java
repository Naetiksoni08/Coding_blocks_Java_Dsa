package blind_45_days_sheet;

import java.util.*;

public class threesum {

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> ll = new ArrayList<>();
		Arrays.sort(arr); // n log n
		for (int i = 0; i < arr.length; i++) { // n
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			int left = i + 1;
			int right = arr.length - 1;
			while (left < right) {// n
				int sum = arr[i] + arr[left] + arr[right];
				if (sum == 0) {
					ll.add(Arrays.asList(arr[i], arr[left], arr[right]));
					while (left < right && arr[left] == arr[left + 1])
						left++;
					while (left < right && arr[right] == arr[right - 1])
						right--;
					left++;
					right--;
				} else if (sum > 0) {
					right--;
				} else {
					left++;
				} // so tc is n log n+n2 = n2
			}
		}
		System.out.println(ll);

	}

}

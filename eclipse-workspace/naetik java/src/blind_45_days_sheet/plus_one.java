package blind_45_days_sheet;

import java.util.Arrays;

public class plus_one {

	public static void main(String[] args) {
		long[] arr = { 9, 9, 9 };
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < 9) {
				arr[i]++;
				System.out.println(Arrays.toString(arr));
				return;
			}
			arr[i] = 0; // 9 tha → 0 karo, carry aage!
		}
		int[] result = new int[arr.length + 1];
		result[0] = 1; // pehla element 1!
		System.out.println(Arrays.toString(result));

	}
}

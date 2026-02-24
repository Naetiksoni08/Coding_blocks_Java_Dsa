package blind_45_days_sheet;

import java.util.Arrays;

public class minimum_moves_to_equal_array_elements_2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		Arrays.sort(arr);
		System.out.println(minimummoves(arr));
	}

	public static int minimummoves(int[] arr) {
		int median = arr[arr.length / 2]; // arr[2/2]=1 so arr[1]=2 that is the value of median correct logic
		int moves = 0;
		for (int i = 0; i < arr.length; i++) {
			moves += Math.abs(arr[i] - median);
		}
		return moves;

	}

//	moves += arr[i] - median; this will cancel negative values ie 
	// 1,2,3 median=2 1-2+2-2+3-2 = -1+0+1 = -1+1=0 so thats why absolute value will
	// work

	// tc will be n for loop and n log n for sorting so n+n log n = n log n (cuz
	// dominant value rule applies)
}

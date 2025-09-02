package assignment_questions;

import java.util.*;

public class Rain_water_trapping_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();

			}
			System.out.println(rainwater(arr));

		}
		t--;

	}

	public static int rainwater(int[] arr) {
		// left array
		int[] left = new int[arr.length];
		left[0] = arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);

		}
		// right array
		int[] right = new int[arr.length];
		right[arr.length - 1] = arr[arr.length - 1]; // n is array ka length only
		for (int i = arr.length - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);

		}
		int sum = 0;
		for (int i = 0; i < right.length; i++) {
			sum+=Math.min(left[i], right[i])-arr[i];
		}

		return sum;

	}

}

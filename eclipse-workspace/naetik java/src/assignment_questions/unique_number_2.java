package assignment_questions;

import java.util.*;

public class unique_number_2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] result = number(arr);
		Arrays.sort(result);
		for (int ans : result) {
			System.out.print(ans + " ");
		}

	}

	public static int[] number(int[] arr) {
		int ans = 0;
		for (int num : arr) {
			ans ^= num;
		}
		int mask = (ans & (~(ans - 1)));
		int a = 0;
		for (int value : arr) {
			if ((value & mask) != 0) {
				a ^= value;
			}
		}
		int b = ans ^ a;
		return new int[] { a, b };
	}

}

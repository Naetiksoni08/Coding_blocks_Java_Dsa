package assignment_questions;

import java.util.*;

public class Unlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] arr = new int[n];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			map.put(arr[i], i);
		}

		for (int i = 0; i < n && k > 0; i++) {
			int target = n - i;
			if (arr[i] == target) {
				continue;
			}
			int targetidx = map.get(target); // target ka index get karlo

			int temp = arr[i];
			arr[i] = arr[targetidx];
			arr[targetidx] = temp;

			map.put(arr[targetidx], targetidx);
			map.put(arr[i], i);

			k--;
		}
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}

}
//refer to register for dry run 
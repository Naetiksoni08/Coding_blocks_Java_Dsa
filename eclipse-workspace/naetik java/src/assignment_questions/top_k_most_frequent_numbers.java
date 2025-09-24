package assignment_questions;

import java.util.*;

public class top_k_most_frequent_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			top_k(arr, k);
		}
	}

	public static void top_k(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}

			List<Integer> temp = new ArrayList<>(map.keySet());
	
			temp.sort((a, b) -> {
				if (!map.get(a).equals(map.get(b)))
					return map.get(b) - map.get(a);
				else
					return a - b;
			});

			int count = Math.min(k, temp.size());
			for (int j = 0; j < count; j++) {
				System.out.print(temp.get(j) + " ");
			}
		}
		System.out.println();
	}
}



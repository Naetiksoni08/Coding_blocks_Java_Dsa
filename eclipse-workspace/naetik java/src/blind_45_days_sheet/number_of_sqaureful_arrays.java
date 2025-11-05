package blind_45_days_sheet;

import java.util.*;

public class number_of_sqaureful_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 2 };
		Arrays.sort(arr);
		boolean[] visited = new boolean[arr.length];
		List<Integer> ll = new ArrayList<>();
		generatepermuation(arr, visited, ll);
		System.out.println(count);

	}

	static int count = 0;

	public static void generatepermuation(int[] arr, boolean[] visited, List<Integer> ll) {
		if (ll.size() == arr.length) {
			if (isSquareful(ll)) {
//				System.out.println(ll);
				count++;

			}
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (visited[i])
				continue;

			if (i > 0 && arr[i] == arr[i - 1] && !visited[i - 1])
				continue;

			if (!visited[i]) {
				visited[i] = true;
				ll.add(arr[i]);
				generatepermuation(arr, visited, ll);
				ll.remove(ll.size() - 1);
				visited[i] = false;

			}
		}

	}

	public static boolean isSquareful(List<Integer> ans) {
		for (int i = 0; i < ans.size() - 1; i++) {
			int sum = ans.get(i) + ans.get(i + 1);
			int sqrt = (int) Math.sqrt(sum); // because sqrt is a double
			if (sqrt * sqrt != sum) {
				return false;
			}
		}
		return true;
	} // bro this version wont submit on the leetcode u need to check early whether
		// the forming permaution is a sqaureful array then only form the permuation
		// otherwise dont so the only change that u should do is that before marking it
		// to be visited check if the current elements inside the list are sqaureful or
		// not and for that just take the whole body of the sqaureful function and pass
		// it before marking it to be visited

}

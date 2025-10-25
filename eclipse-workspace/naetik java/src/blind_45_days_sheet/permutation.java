package blind_45_days_sheet;

import java.util.*;

public class permutation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		boolean[] board = new boolean[arr.length];
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		permutation2(arr, ll, 0, board, ans);
		System.out.println(ans);

	}

	public static void permutation2(int[] arr, List<Integer> ll, int idx, boolean[] board, List<List<Integer>> ans) {
		if (idx == arr.length) {
			ans.add(new ArrayList<>(ll));
			return;

		}
		for (int i = 0; i < board.length; i++) {
			if (!board[i]) { // if (!board[i]) basically means if board of i is false for tha particular
								// element then mark it true
				board[i] = true; // mark it as true
				ll.add(arr[i]);
				permutation2(arr, ll, idx + 1, board, ans);
				ll.remove(ll.size() - 1);
				board[i] = false;
			}
		}

	}

}

package blind_45_days_sheet;

import java.util.*;

public class permutation_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 2 };
		Arrays.sort(arr);
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		boolean[] board = new boolean[arr.length];
		permutation(arr, ll, board, ans);
		System.out.println(ans);

	}

	public static void permutation(int[] arr, List<Integer> ll, boolean[] board, List<List<Integer>> ans) {
		if (ll.size() == arr.length) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i])
				continue;
			if (i > 0 && arr[i] == arr[i - 1] && !board[i - 1])
				continue;
			board[i] = true;
			ll.add(arr[i]);
			permutation(arr, ll, board, ans);
			ll.remove(ll.size() - 1);
			board[i] = false;
		}

	}

}

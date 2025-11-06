package blind_45_days_sheet;

import java.util.*;

public class reconstruct_a_two_row_binary_matrix_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upper = 2;
		int lower = 1;
		int[] colsum = { 1, 1, 1 };
		List<List<Integer>> ans = reconstruct(upper, lower, colsum);
		if (ans.isEmpty()) {
			System.out.println("[]");

		} else {
			for (List<Integer> ll : ans) {
				System.out.println(ll);
			}
		}
	}

	public static List<List<Integer>> reconstruct(int upper, int lower, int[] colsum) {
		int n = colsum.length;

		List<Integer> top = new ArrayList<>(Collections.nCopies(n, 0));
		List<Integer> bottom = new ArrayList<>(Collections.nCopies(n, 0));

		for (int i = 0; i < n; i++) {
			if (colsum[i] == 2) {
				top.set(i, 1);
				bottom.set(i, 1);
				upper--;
				lower--;
			}
		}
		// if colsum==1
		for (int i = 0; i < n; i++) {
			if (colsum[i] == 1) {
				if (upper > lower) {
					top.set(i, 1);
					bottom.set(i, 0);
					upper--;
				} else {
					top.set(i, 0);
					bottom.set(i, 1);
					lower--;
				}
			}
		}
		if (upper != 0 || lower != 0) {
			return new ArrayList<>();
		}

		List<List<Integer>> result = new ArrayList<>();
		result.add(top);
		result.add(bottom);
		return result;
	}

}

//
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	int upper = 2;
//	int lower = 1;
//	int[] colsum = { 1, 1, 1 };
//	int[][] ans = reconstruct(upper, lower, colsum);
//	if (ans.length == 0) {
//		System.out.println("[]");
//	} else {
//		for (int i = 0; i < ans.length; i++) {
//			for (int j = 0; j < ans[0].length; j++) {
//				System.out.print(ans[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
//
//}
//public static int[][] reconstruct(int upper, int lower, int[] colsum) {
//	int n = colsum.length;
//	int[][] ans = new int[2][n];
//
//	// if colsum == 2
//	for (int i = 0; i < n; i++) {
//		if (colsum[i] == 2) {
//			ans[0][i] = 1;
//			ans[1][i] = 1;
//			upper--;
//			lower--;
//		}
//	}
//	// if colsum==1
//	for (int i = 0; i < n; i++) {
//		if (colsum[i] == 1) {
//			if (upper > lower) { // Greedy choice — give to upper if we still can, else to lower
////				Jab bhi humare paas koi colsum[i] == 1 aaye,
////						hum us ek single 1 ko usi row ko dete hain jiske paas zyada 1s bache hue hain daalne ke liye.
//				ans[0][i] = 1;
//				ans[1][i] = 0;
//				upper--;
//			} else {
//				ans[0][i] = 0;
//				ans[1][i] = 1;
//				lower--;
//			}
//		}
//	}
//
//	if (upper != 0 || lower != 0) {
//		return new int[0][0];
//	}
//	return ans;
//
//}
//
//}

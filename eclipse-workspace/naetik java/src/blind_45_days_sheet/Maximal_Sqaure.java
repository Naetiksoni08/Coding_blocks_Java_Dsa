package blind_45_days_sheet;

import java.util.*;

public class Maximal_Sqaure {
	public static void main(String[] args) {
		char[][] matrix = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
				{ '1', '0', '0', '1', '0' } };
		System.out.println(calculate_height(matrix));
	}

	public static int calculate_height(char[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return 0;
		}

		int col = matrix[0].length;
		int[] height = new int[col];
		int ans = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] == '1') {
					height[j] += 1;
				} else {
					height[j] = 0;
				}
			}
			ans = Math.max(ans, Area(height));
		}
		return ans;

	}

	private static int Area(int[] arr) {

		int area = 0;
		int w;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i <= arr.length; i++) {
			 int curr = (i == arr.length ? 0 : arr[i]);
			while (!st.isEmpty() && curr < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;
				if (st.isEmpty()) {
					w = r;
				} else {
					int l = st.peek();
					w = r - l - 1;

				}
				int side = Math.min(h, w);
				area = Math.max(area, side * side);
			}
			st.push(i);
		}
		return area;
	}

}

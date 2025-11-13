package assignment_questions;

import java.util.*;

public class maximal_rectangle {

	public static void main(String[] args) {
		char[][] matrix = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
				{ '1', '0', '0', '1', '0' } };
		System.out.println(calculate_height(matrix));
	}

	public static int calculate_height(char[][] matrix) {
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

	public static int Area(int[] arr) {
		int area = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;
				if (st.isEmpty()) {
					area = Math.max(area, h * r);
				} else {
					int l = st.peek();
					area = Math.max(area, h * (r - l - 1));
				}
			}
			st.push(i);
		}
		int r = arr.length;
		while (!st.isEmpty()) {
			int h = arr[st.pop()];
			if (st.isEmpty()) {
				area = Math.max(area, h * r);
			} else {
				int l = st.peek();
				area = Math.max(area, h * (r - l - 1));
			}
		}

		return area;
	}

}

package blind_45_days_sheet;

import java.util.HashSet;

public class set_matrix_zeroes {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		HashSet<Integer> zero_rows = new HashSet<>();
		HashSet<Integer> zero_cols = new HashSet<>();

		// scanning
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					zero_rows.add(i);
					zero_cols.add(j);
				}
			}
		}
		// modify
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (zero_rows.contains(i) || zero_cols.contains(j)) {
					matrix[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}

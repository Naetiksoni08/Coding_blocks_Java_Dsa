package blind_45_days_sheet;

public class set_matrix_zeroes_optimized {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		setZeroes(matrix);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void setZeroes(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		boolean firstColZero = false;

		// Step 1: check if column 0 originally had any zero
		for (int i = 0; i < rows; i++) {
			if (matrix[i][0] == 0) {
				firstColZero = true;
			}
		}

		// Step 2: use first row and first column as markers
		// start i,j from 1 so we don't disturb matrix[0][0] mid-scan
		for (int i = 0; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0; // row marker
					matrix[0][j] = 0; // column marker
				}
			}
		}

		// Step 3: use markers to zero out cells (skip first row/col for now)
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}

		// Step 4: handle row 0 using matrix[0][0]
		if (matrix[0][0] == 0) {
			for (int j = 0; j < cols; j++) {
				matrix[0][j] = 0;
			}
		}

		// Step 5: handle column 0 using the saved flag
		if (firstColZero) {
			for (int i = 0; i < rows; i++) {
				matrix[i][0] = 0;
			}
		}
	}
}

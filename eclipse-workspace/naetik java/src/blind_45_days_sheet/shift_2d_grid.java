package blind_45_days_sheet;

import java.util.*;

public class shift_2d_grid {

	public static void main(String[] args) {
		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int k = 1;
		int m = grid.length;
		int n = grid[0].length;
		int total = m * n;
		List<Integer> flat = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				flat.add(grid[i][j]); // ndividual elements add ho jayenge
			}
		}
		k = k % total; // k = 9 hai toh fir 9%9= 0zero elements move karo
		// in this case 1%9 = 1 element to shift

		List<Integer> shifted = new ArrayList<>();
		for (int i = total - k; i < total; i++) { // 8idx sai 9idx tk mtlb 1 hi baar loop chalega aur milega 9
			shifted.add(flat.get(i)); // 9 get karo aur shit mai add karo
		}
		for (int i = 0; i < total - k; i++) { // fir baki ke 8 digits add karo shift mai 0 sai 8 tk chalega
			shifted.add(flat.get(i));
		}
		// convert karo final 2d
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				int index = i * n + j;
				row.add(shifted.get(index));
			}
			result.add(row);
		}
		System.out.println(result);
	}

}
//int index = i * n + j; check this 
//| i (row) | j (col) | Formula: `i * n + j` | idx | 1D Array |
//| ------- | ------- | -------------------- | --- | -------- |
//| 0       | 0       | 0 * 3 + 0 = 0       | 0   | 1        |
//| 0       | 1       | 0 * 3 + 1 = 1       | 1   | 2        |
//| 0       | 2       | 0 * 3 + 2 = 2       | 2   | 3        |
//| 1       | 0       | 1 * 3 + 0 = 3       | 3   | 4        |
//| 1       | 1       | 1 * 3 + 1 = 4       | 4   | 5        |
//| 1       | 2       | 1 * 3 + 2 = 5       | 5   | 6        |
//| 2       | 0       | 2 * 3 + 0 = 6       | 6   | 7        |
//| 2       | 1       | 2 * 3 + 1 = 7       | 7   | 8        |
//| 2       | 2       | 2 * 3 + 2 = 8       | 8   | 9        |


//int[][] result = new int[m][n];
//for (int idx = 0; idx < total; idx++) {
//	result[idx / n][idx % n] = shifted.get(idx); // /3 gives rows and %3 gives cols and why 3 because 3 rows hai
//													// and har row mai 3 elements
//}
//idx=0:  result[0][0] = shifted.get(0) = 9
//idx=1:  result[0][1] = shifted.get(1) = 1
//idx=2:  result[0][2] = shifted.get(2) = 2
//idx=3:  result[1][0] = shifted.get(3) = 3
//idx=4:  result[1][1] = shifted.get(4) = 4
//idx=5:  result[1][2] = shifted.get(5) = 5
//idx=6:  result[2][0] = shifted.get(6) = 6
//idx=7:  result[2][1] = shifted.get(7) = 7
//idx=8:  result[2][2] = shifted.get(8) = 8
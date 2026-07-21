package blind_45_days_sheet;

public class search_a_2d_matrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;

		int m = matrix.length;
		int n = matrix[0].length;

		int low = 0;
		int high = m * n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int row = mid / n;
			int col = mid % n;
			int newmid = matrix[row][col];

			if (target == newmid) {
				System.out.println(true);
			} else if (newmid > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		System.out.println(false);

	}
 // solution is posted on leetcode 
}

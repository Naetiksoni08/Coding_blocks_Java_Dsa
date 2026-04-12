package blind_45_days_sheet;

public class find_the_degree_of_each_vertex {

	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 1 }, { 1, 0, 1 }, { 1, 1, 0 } };
		int n = matrix.length;
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ans[i] += matrix[i][j];
			}
		}
		System.out.println(ans);

	}

}

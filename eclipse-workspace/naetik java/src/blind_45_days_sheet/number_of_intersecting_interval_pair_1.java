package blind_45_days_sheet;

public class number_of_intersecting_interval_pair_1 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 2, 3 }, { 3, 4 } };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int a = arr[i][0]; // 1
				int b = arr[i][1]; // 2
				int c = arr[j][0]; // 2
				int d = arr[j][1];// 3 so 1<=3 and 2<=2 so count++
				if (a <= d && c <= b) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}

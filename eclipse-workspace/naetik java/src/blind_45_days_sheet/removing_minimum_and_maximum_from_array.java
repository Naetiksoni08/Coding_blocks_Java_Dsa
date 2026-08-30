package blind_45_days_sheet;

public class removing_minimum_and_maximum_from_array {

	public static void main(String[] args) {
		int[] arr = { 2, 10, 7, 5, 4, 1, 8, 6 };
		int n = arr.length;
		int minidx = 0;
		int maxidx = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] < arr[minidx]) {
				minidx = i;
			}
			if (arr[i] > arr[maxidx]) {
				maxidx = i;
			}
		}

		int case1 = Math.max(maxidx, minidx) + 1;
		int case2 = n - Math.min(minidx, maxidx);

		int case3A = (maxidx + 1) + (n - minidx);
		int case3B = (minidx + 1) + (n - maxidx);
		int case3 = Math.min(case3A, case3B);

		System.out.println(Math.min(case1, Math.min(case2, case3)));
	}

}

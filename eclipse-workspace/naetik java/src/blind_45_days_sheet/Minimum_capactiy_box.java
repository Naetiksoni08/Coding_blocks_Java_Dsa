package blind_45_days_sheet;

public class Minimum_capactiy_box {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 7 };
		int itemsize = 3;
		int mincapactiy = Integer.MAX_VALUE;
		int ans = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= itemsize && arr[i] < mincapactiy) {
				mincapactiy = arr[i];
				ans = i;
			}

		}
		System.out.println(ans);

	}

}

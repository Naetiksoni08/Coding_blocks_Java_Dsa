package blind_45_days_sheet;

public class find_the_minimum_balanced_index {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 2 };
		int[] prefixsum = new int[arr.length];
		prefixsum[0] = 0;
		for (int i = 1; i < prefixsum.length; i++) {
			prefixsum[i] = arr[i - 1] + prefixsum[i - 1];
		}
		long[] suffixproduct = new long[arr.length];
		suffixproduct[arr.length - 1] = 1;
		for (int i = arr.length - 2; i >= 0; i--) {
			suffixproduct[i] = arr[i + 1] * suffixproduct[i + 1];
		}
		for (int i = 0; i < arr.length; i++) {
			if (prefixsum[i] == suffixproduct[i]) {
				System.out.println(i);
			}
		}
		System.out.println(-1);
	}

}

package blind_45_days_sheet;

public class Patching_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 10 };
		int n = 20;
		System.out.println(patching(arr, n));

	}

	public static int patching(int[] arr, int n) {
		long miss = 1; // to prevent overflow
		int patches = 0;
		int i = 0;
		while (miss <= n) { // till miss is smaller and or equal to n
			if (i < arr.length && arr[i] <= miss) {
					miss = miss + arr[i];
					i++;
				} else {
					patches++;
					miss += miss;
				}
			}
		return patches;
	}

}

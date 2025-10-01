package blind_45_days_sheet;

public class rain_water_trapping_prefix_concept {

	public static void main(String[] args) {
		int [] arr = {5,3,1,2,7,4,1,6};
		System.out.println(rain_trap(arr));

	}

	public static int rain_trap(int[] arr) {
		//left array
		int n = arr.length;
		int[] left = new int[n];
		left[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}
		//right array
		int[] right = new int[n];
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);
		}
		
		//area calculation
		int sum = 0;
		for (int i = 0; i < right.length; i++) {
			sum += Math.min(left[i], right[i]) - arr[i];
		}
		return sum;
	}
}

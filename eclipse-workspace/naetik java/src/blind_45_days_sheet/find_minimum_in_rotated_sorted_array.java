package blind_45_days_sheet;

public class find_minimum_in_rotated_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(findminimum(arr));

	}

	public static int findminimum(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		while (low < high) {
			int mid = (low + high) / 2;
			if (arr[mid] > arr[high]) { // upper line
				low = mid + 1;
			} else if (arr[mid] < arr[high]) { // if that so then we are on the lower line
				high = mid; //
				// “I can’t discard mid yet, because mid itself might be the smallest element
				// (the pivot).” thats why high = mid and not mid-1
			} else {

			}
		}
		return arr[low];

	}
//Upper line (big numbers): [4,5,6,7]
//Lower line (small numbers): [0,1,2]

}

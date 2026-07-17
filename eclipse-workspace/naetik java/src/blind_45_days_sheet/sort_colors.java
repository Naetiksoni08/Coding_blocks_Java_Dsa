package blind_45_days_sheet;

public class sort_colors {

	public static void main(String[] args) {
		int[] arr = { 2, 0, 2, 1, 1, 0 };
		int low = 0;
		int mid = 0; // this is like i only used to traverse on the array
		int high = arr.length - 1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;

			} else if (arr[mid] == 1) {
				mid++; // skip it left yani 0 aur right yani 2 ko agar fix kardia toh 1 automatcally
						// sahi ho jayega
			} else {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
//mid++;  yeh nai karenge kyuki high sai swap karne par high ki jagah par koi bhi value aah sakti hai 2 bhi aur 1 bhi toh hum recheck karenge arr[mid] ki value ko 
			}
		}
	}

}

package blind_45_days_sheet;

public class merge_sorted_Array {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 }, nums2 = { 2, 5, 6 };
		int m = 3;
		int n = 3;
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				i--;
			} else {
				nums1[k] = nums2[j];
				j--;
			}
			k--;
		}
		while (j >= 0) { // if by chance num2 ke elements rehe jaye toh unke liye yeh toh fir aise bhi
							// toh ho sakta hai ki num1 ke element rehe jaye toh uske liye kyu handle nai
							// kia because agar num1 ke element rehe bhi jate hai toh voh already num1 mai
							// present hai so no need to worry also humne i and j ko piche sai kyu start kia
							// because aage sai karte toh num1 ke sare elements overwrite hote aur sab shift
							// hote position change karni padhti sabki thats why
			nums1[k] = nums2[j];
			j--;
			k--;
		}
	} //solution is posted on leetcode

}

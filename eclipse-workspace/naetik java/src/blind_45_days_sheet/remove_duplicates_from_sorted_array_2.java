package blind_45_days_sheet;

public class remove_duplicates_from_sorted_array_2 {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2, 3 };
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (k < 2 || arr[i] != arr[k - 2]) { // simple k<2 hona chahiye second thing arr[i] != arr[k-2] check karta
													// hai ki kya joh current element hai voh pichle 2 element ke phele
													// walla equal toh nai hai mtlb ki jaise manle arr[i] is 1 toh check
													// karega ki kya arr[i] = 1 !=arr[3-2] = arr[1 ] = 1 mtlb 1!=1 equal
													// hai ? agar current element equal hai k-2 ke toh iska mtlb already
													// 2 copies present hai array mai toh skip kardo yeh current element
													// ko
				arr[k] = arr[i];
				k++;
			} else {
				continue;
			}
		}
		System.out.println("k = " + k);
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

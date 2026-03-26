package blind_45_days_sheet;

public class longest_arithmetic_sequence_after_changing_at_most_one_element {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 6, 7 };
		int ans = 2;
		for (int i = 0; i < arr.length-1; i++) { 
			boolean replaced = false;
			int diff = arr[i + 1] - arr[i];
			int len = 2;
			int last = arr[i + 1];
			for (int j = i + 1; j < arr.length-1; j++) { // n-1 because we are accessing j+1 so index out of bounds sai bach nai ke liye n-1 
				if (arr[j + 1] - last == diff) {
					last = arr[j+1];
					len++;
				}else if(!replaced) {
					replaced = true;
					last = last+diff;
					len++;
				}else {
					break;
				}
			}
			ans = Math.max(ans, len);
		}
		System.out.println(ans);
	}
 // this code fails at test case 1,1,2,3 
}

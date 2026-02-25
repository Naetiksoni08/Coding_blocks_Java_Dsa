package blind_45_days_sheet;

public class remove_element {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 2, 3 };
		int val = 3;
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != val) {
				arr[k] = arr[i];
				k++;
			}
		}
		System.out.println(k);

	}// in place -->Naya array mat banao — same array mein hi changes karo! jaise iss
		// question ki tc will be O(n) and sc = O(1)

}

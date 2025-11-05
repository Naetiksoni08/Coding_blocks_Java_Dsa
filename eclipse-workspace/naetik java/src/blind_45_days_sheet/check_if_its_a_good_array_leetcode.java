package blind_45_days_sheet;

public class check_if_its_a_good_array_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {12,5,7,23};
		System.out.println(good_array(arr));
		

	}

	public static boolean good_array(int[] arr) {
		int number = arr[0];
		for (int i = 1; i < arr.length; i++) {
			number = gcd(number, arr[i]); //note 1,any no gcd = 1 only 
			if (number == 1) {
				return true;
			}

		}

		return number==1;

	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}

package blind_45_days_sheet;

public class mirror_distance_of_an_integer {

	class Solution {
		public int mirrorDistance(int n) {
			String s = String.valueOf(n);
			String reverse = new StringBuilder(s).reverse().toString();
			int rev= Integer.parseInt(reverse);
			return Math.abs(n-rev);

		}
	}

}

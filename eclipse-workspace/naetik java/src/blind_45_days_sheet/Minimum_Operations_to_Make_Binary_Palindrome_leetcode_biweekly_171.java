package blind_45_days_sheet;

public class Minimum_Operations_to_Make_Binary_Palindrome_leetcode_biweekly_171 {

	class Solution {
		public int[] minOperations(int[] nums) {
			int[] ans = new int[nums.length];
			for (int i = 0; i < nums.length; i++) {
				int mid = nums[i];
				ans[i] = minOpsToBinaryPalindrome(mid);

			}
			return ans;

		}

		private int minOpsToBinaryPalindrome(int x) {
			int down = 0;
			int a = x;
			while (a >= 0 && !ispalindrome(a)) {
				a--;
				down++;
			}
			int up = 0;
			int b = x;
			while (!ispalindrome(b)) {
				b++;
				up++;
			}
			return Math.min(up, down);

		}

		public boolean ispalindrome(int x) {
			String s = Integer.toBinaryString(x);
			int i = 0;
			int j = s.length() - 1;
			while (i < j) {
				if (s.charAt(i) != s.charAt(j)) {
					return false;

				}
				i++;
				j--;
			}
			return true;

		}

	}

}

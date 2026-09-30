package blind_45_days_sheet;

public class Number_of_substrings_containing_all_3_character {

	public static void main(String[] args) {
		String s = "abcabc";
		int left = 0;
		int ans = 0;
		int[] count = new int[3]; // a,b,c
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++; // a - 2 , b-2 ,c-2

			while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
				count[s.charAt(left) - 'a']--;
				left++;
			}
			ans += left;
		}
		System.out.println(ans);

	}

}

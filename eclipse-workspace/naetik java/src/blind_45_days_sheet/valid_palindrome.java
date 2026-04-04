package blind_45_days_sheet;

public class valid_palindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		StringBuilder result = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if (Character.isLetterOrDigit(ch)) {
				result.append(Character.toLowerCase(ch)); // clean string 
			}
		}
		int left = 0;
		int right = result.length() - 1;
		while (left < right) {
			if (result.charAt(left) != result.charAt(right)) {
				System.out.println(false);
			}
			left++;
			right--;
		}
		System.out.println(true);
	}

}

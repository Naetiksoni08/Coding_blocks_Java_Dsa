package blind_45_days_sheet;

public class shortest_and_lexicographically_smallest_beautiful_string {
	public static void main(String[] args) {
		String s = "100011001";
		int k = 3;
		int min = Integer.MAX_VALUE;
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String substring = s.substring(i, j + 1);
				int countones = countones(substring);
				if (countones == k) {
					if (substring.length() < min) {
						min = substring.length();
						ans = substring;
					} else if (substring.length() == min && substring.compareTo(ans) < 0) {
						ans = substring;
					}
				}

			}
		}
		System.out.println(ans);
	}

	public static int countones(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c == '1') {
				count++;
			} else {
				continue;
			}
		}
		return count;
	}

}

// compare to is used for checking which string is smaller lexicographically yeh internally ek ek character ko check karti hai konsa bada hai konsa chota we wangt smaller one 
//Negative number agar str1 lexicographically chota hai str2 se
//Positive number agar str1 lexicographically bada hai str2 se
//0 agar dono equal hain

//also 
//Lexicographic check hamesha nahi karna, sirf tab karna hai jab competition ho — matlab jab same minimum length ke 2 ya zyada candidates ho
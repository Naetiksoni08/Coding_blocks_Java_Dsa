package blind_45_days_sheet;

public class find_smallest_letter_greater_than_the_target {

	public static void main(String[] args) {
		char[] letter = { 'c', 'f', 'j' };
		char target = 'a';
		// because array is sorted we can say that if the first letter is bigger than
		// the target then that would be our answer soo
		for (char c : letter) {
			if (c > target) { // first bigger character than target 
				System.out.println(c);
			}
		}
		System.out.println(letter[0]);
	}
}

// this approach had some bugs and first was ki ans = c - target negative bhi ho sakta hai! and also Minimum difference se character nahi milega — actual character chahiye!
//
//public static void main(String[] args) {
//    char[] letter = { 'c', 'f', 'j' };
//    int target = 'a';
//    int firstchar = letter[0];
//    int min = Integer.MAX_VALUE;
//    for (char c : letter) {
//        int ans = c - target;
//        min = Math.min(min, ans);
//         System.out.println(min);
//    }
//    System.out.println(firstchar);
//}
// 
//}
package blind_45_days_sheet;

public class find_the_score_difference_in_a_game {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int score1 = 0;
		int score2 = 0;
		boolean first_active = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) { // odd hai
				first_active = !first_active;
			}
			if (i % 6 == 5) {
				first_active = !first_active;
			}

			if (first_active) {
				score1 += arr[i];
			} else {
				score2 += arr[i];
			}

		}
		System.out.println(score1 - score2);

	}

}

package blind_45_days_sheet;

import java.util.Arrays;

public class score_validator {

	public static void main(String[] args) {
		String[] events = { "1", "4", "W", "6", "WD" };
		int score = 0;
		int counter = 0;
		int i = 0;
		while (i < events.length && counter < 10) {
			if (events[i].equals("W")) {
				counter += 1;
			} else if (events[i].equals("WD") || events[i].equals("NB")) {
				score += 1;
			} else {
				score += Integer.parseInt(events[i]);

			}
			i++;
		}
		int[] result = new int[] { score, counter };
		System.out.println(Arrays.toString(result));
	}

}

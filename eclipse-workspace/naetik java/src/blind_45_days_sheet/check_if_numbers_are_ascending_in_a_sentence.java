package blind_45_days_sheet;

public class check_if_numbers_are_ascending_in_a_sentence {

	public static void main(String[] args) {
		String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
		String[] chunks = s.split(" ");
		int prev = -1;
		for (String chunk : chunks) {
			if (Character.isDigit(chunk.charAt(0))) { // multi number mai bhi chalega say 12 tha toh charaat 0 = 1 so if
														// chalega and then curr = "12" - > 12 because pure chunk ka parse int hoga 
				int curr = Integer.parseInt(chunk);
				if (curr <= prev) { // 5 and 5 hai toh bhi false strictly increasing nai hai na
					System.out.println(false);
				}
				prev = curr; // curr ko prev bana do

			}
			// words ko ignore karo simply cuz the if didnt work then paaka sai voh word hai
			// aur chal gaya toh it is a digit

		}
		System.out.println(true);

	}

}

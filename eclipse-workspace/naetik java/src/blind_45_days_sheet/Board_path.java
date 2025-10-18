package blind_45_days_sheet;

import java.util.Iterator;

public class Board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		printans(n, 0, "");
		System.out.println();
		System.out.println(count);

	}

	// curr - currently where i am
	// end point is n
	static int count = 0;

	public static void printans(int n, int curr, String ans) {
		if (curr == n) {
			System.out.print(ans + " ");
			count++;
			return;
		}
		if (curr > n) {
			return;
		}
		for (int dice = 1; dice <= 3; dice++) {
			printans(n, curr + dice, ans + dice);

		}
	}

}

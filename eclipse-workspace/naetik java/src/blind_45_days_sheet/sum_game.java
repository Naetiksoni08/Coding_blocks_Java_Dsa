package blind_45_days_sheet;

public class sum_game {
	class Solution {
		public boolean sumGame(String num) {
			int leftsum = 0;
			int rightsum = 0;
			int leftq = 0;
			int rightq = 0;
			int n = num.length();
			int half = n / 2;
			// lefthalf

			for (int i = 0; i < half; i++) {
				char ch = num.charAt(i);
				if (ch == '?') {
					leftq++;
				} else {
					leftsum += ch - '0';
				}
			}
			for (int i = half; i < n; i++) {
				char ch = num.charAt(i);
				if (ch == '?') {
					rightq++;
				} else {
					rightsum += ch - '0';
				}
			}
			int diff = leftsum - rightsum;
			int diffq = leftq - rightq;
			// lastly one condition is left that if the total no of question marks are odd
			// then alice wins because alice moves first so alice will get more chances to
			// imbalance the sum so for that we do this
			int totalq = leftq + rightq;
			if (totalq % 2 != 0) { // this means odd no of ?.
				return true;
			}

			return 2 * diff + 9 * diffq != 0; // this is nothing but if 2*9+9*-2 = 18+-18 if is not equal to 0 then
												// Alice wins but if it is equal to 0 then else == then Bob wins
// we * with 2 because the chances are alternative if on right side there are 2 ? then one is for bob and one is for alice
		}
	}
}

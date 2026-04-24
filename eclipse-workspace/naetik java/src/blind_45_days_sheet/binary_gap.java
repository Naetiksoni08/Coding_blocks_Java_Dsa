package blind_45_days_sheet;

public class binary_gap {

	public static void main(String[] args) {
		int n = 22;
		int currentidx = 0;
		int maxgap = 0;
		int lastone = -1;
		while (n > 0) {
			if ((n & 1) == 1) {
				if (lastone != -1) {
					maxgap = Math.max(maxgap, currentidx - lastone);
				}
				lastone = currentidx;

			}
			n>>=1;
			currentidx++;
		}
		System.out.println(maxgap);
	}

}

package blind_45_days_sheet;

public class minimum_bishop_moves_to_reach_target {

	public static void main(String[] args) {
		int[] source = { 8, 1 }, target = { 1, 8 };
		int sourcesum = source[0] + source[1];
		int targetsum = target[0] + target[1];
		if (sourcesum % 2 != targetsum % 2) {
			System.out.println(-1);
			return;
		} else {
			int sr = source[0];
			int tr = target[0];
			int sc = source[1];
			int tc = target[1];

			if (Math.abs(sr - tr) == Math.abs(sc - tc)) {
				System.out.println(1);
			} else {
				System.out.println(2);

			}

		}
	}

}

package blind_45_days_sheet;

public class jump_game {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 1, 4 };
		int maxreach = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i > maxreach) {
				System.out.println(false);
				return;
			}
			maxreach = Math.max(maxreach, i + arr[i]);

		}
//		if (maxreach >= arr.length - 1) {
//			System.out.println(true);
//			return;
//		}
		System.out.println(true);

	}

}

package blind_45_days_sheet;

public class jump_game_2 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 1, 4 };
		int maxreach = 0;
		int jumps = 0;
		int currentend = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (i > maxreach) {
				System.out.println(0);
			}
			maxreach = Math.max(maxreach, i + arr[i]);

			if (i == currentend) {
				jumps++;
				currentend = maxreach;
			}
		}
		System.out.println(jumps);

	}

}

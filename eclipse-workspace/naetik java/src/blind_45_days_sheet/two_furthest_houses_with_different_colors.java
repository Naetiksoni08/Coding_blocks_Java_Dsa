package blind_45_days_sheet;

public class two_furthest_houses_with_different_colors {
	public static void main(String[] args) {
		int[] color = { 1, 1, 1, 6, 1, 1, 1 };
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < color.length; i++) {
			for (int j = i + 1; j < color.length; j++) {
				if (color[i] != color[j]) {
					ans = Math.max(ans, Math.abs(i - j));

				}

			}
		}
		System.out.println(ans);

	}

}

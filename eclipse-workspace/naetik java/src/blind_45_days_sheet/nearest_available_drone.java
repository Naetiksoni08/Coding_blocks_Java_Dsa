package blind_45_days_sheet;

public class nearest_available_drone {
	public static void main(String[] args) {
		int[][] drone = { { 0, 0, 8 }, { 2, 2, 9 } };
		int[] target = { 3, 4 };
		int minimumdistance = Integer.MAX_VALUE;
		int result = -1;
		int tx = target[0];
		int ty = target[1];
		for (int i = 0; i < drone.length; i++) {
			int x = drone[i][0];
			int y = drone[i][1];
			int range = drone[i][2];

			int distance = Math.abs(x - tx) + Math.abs(y - ty);

			if (distance <= range) {
				if (distance < minimumdistance) {
					minimumdistance = distance;
					result = i;
				}
			}

		}
		System.out.println(result);

	}

}

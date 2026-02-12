package blind_45_days_sheet;

public class robot_bounded_in_circle {

	public static void main(String[] args) {
		String str = "GGLLGG";
		System.out.println(robot(str));
	}

	public static boolean robot(String s) {
		int x = 0;
		int y = 0;
		int directions = 0;

		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, -1, 0, 1 };

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'G') {
				x += dx[directions];
				y += dy[directions];
			} else if (s.charAt(i) == 'L') {
				directions = (directions + 3) % 4;
			} else {
				directions = (directions + 1) % 4;

			}
		}
		if (x == 0 && y == 0 || directions != 0) {
			return true;
		}
		return false;
	}

}
//directions order
//0 = North
//1 = East
//2 = South
//3 = West

//Right (+1) → clockwise circle complete →
//0 → 1 → 2 → 3 → 0 (wapas North!) 
//Left (+3) → anti-clockwise circle complete →
//0 → 3 → 2 → 1 → 0 (wapas North!) 

// time complexity = O(n) 
//x, y, directions → hamesha sirf 3 variables
//dx, dy → hamesha sirf 4 size arrays input ke saath nahi badh raha isliye O(1)!

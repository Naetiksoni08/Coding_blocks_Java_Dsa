package blind_45_days_sheet;

public class Reaching_points {

	public static boolean main(String[] args) {
		int sx = 1;
		int sy = 1;
		int tx = 3;
		int ty = 5;
		while (tx >= sx && ty >= sy) {
			if (tx == sx && ty == sy) {
				return true;
			}

			if (tx > ty) {
				if (ty > sy) {
					tx = tx % ty;
				} else {
					return (tx - sx) % ty == 0;
				}
			} else {

				if (tx > sx) {
					ty = ty % tx;
				} else {
					return (ty - sy) % tx == 0;
				}
			}
		}
		return false;

	}
}

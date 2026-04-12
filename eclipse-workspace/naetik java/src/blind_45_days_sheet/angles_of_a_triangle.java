package blind_45_days_sheet;

import java.util.*;

public class angles_of_a_triangle {

	public static void main(String[] args) {
		int[] sides = { 3, 4, 5 };
		int a = sides[0];
		int b = sides[1];
		int c = sides[2];
		if (a + b <= c || a + c <= b || b + c <= a) {
			return new double[] {}; // empty arr
		}
		double A = Math.acos((b * b + c * c - a * a) / (2.0 * b * c));
		double B = Math.acos((a * a + c * c - b * b) / (2.0 * a * c));
		double C = Math.acos((a * a + b * b - c * c) / (2.0 * a * b));
		double[] ans = { Math.toDegrees(A), Math.toDegrees(B), Math.toDegrees(C) };
		
		 Arrays.sort(ans);
		System.out.println(ans);

	}

}

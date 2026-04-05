package blind_45_days_sheet;

public class furthest_point_from_the_origin {

	public static void main(String[] args) {
		String moves = "L_RL__R";
		int left = 0, right = 0, blank = 0;
		for (char ch : moves.toCharArray()) {
			if (ch == 'L')
				left++;
			else if (ch == 'R')
				right++;
			else
				blank++;
		}
//		  return Math.max(Math.abs(R-L+blank), Math.abs(R-L-blank));
		
//		R-L+blank → agar saare blank right gaye
//		R-L-blank → agar saare blank left gaye
//		Max of both → maximum distance!
	}
}

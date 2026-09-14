package blind_45_days_sheet;

public class rectangle_overlap {

	public static void main(String[] args) {
		int[] rec1 = { 0, 0, 2, 2 };
		int[] rec2 = { 1, 1, 3, 3 };
		boolean checkXoverlap = rec1[0] < rec2[2] && rec2[0] < rec1[2]; // 0<3 && 1<2 yes
		boolean checkYoverlap = rec1[1] < rec2[3] && rec2[1] < rec1[3]; // remaining values
		System.out.println(checkXoverlap && checkYoverlap);

	}

}

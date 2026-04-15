package blind_45_days_sheet;

public class reverse_bit {

	public static void main(String[] args) {
		int n = 43261596;
		int result = 0;
		for (int i = 0; i < 32; i++) {
			int bit = n & 1;// rightmost bit nikalo
			result = result << 1;// result left shift karo
			result = result | bit;// bit add karo
			n = n >> 1; // next bit pe jao

		}
		System.out.println(result);
	}

}

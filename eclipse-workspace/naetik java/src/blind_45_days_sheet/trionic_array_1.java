package blind_45_days_sheet;

public class trionic_array_1 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 4, 2, 6 };
		int state = 1;
		boolean hasinc = false;
		boolean hasdec = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				if (state == 1)
					hasinc = true;
				else if (state == 2) {
					if (!hasdec)
						System.out.println(false);
					state = 3;
				}

			} else if (arr[i] > arr[i + 1]) {
				if (state == 1) {
					if (!hasinc)
						System.out.println(false);
					state = 2;
					hasdec=true;
				} else if (state == 2)
					hasdec = true;
				else
					System.out.println(false);
			} else {
				System.out.println(false);
			}
		}
		System.out.println(state == 3 && hasdec);
	}

}

package blind_45_days_sheet;

public class pow_of_x_n {

	public static void main(String[] args) {
		int x = (int) 2.00000;
		int n = 10;
		long power = n;
		// x=2 , power = -2
		if (power < 0) { // mtlb x is negtive reciprocate karo
			x = 1 / x; // so 1/2 = 0.5
			power = -power; // 2
		}
		double result = 1;
		while (power > 0) { // ab check karo ki last bit 1 hai ya 0
			if ((power & 1) == 1) {
				result = result * x; // 1 hai toh multiple kardo
			}

			x = x * x; // x ko har step par sqaure bhi karna tha remeber
			power = power >> 1;
		}
		System.out.println(result);
	}

}


//
//power = 10 (binary: 1010)
//
//Iter 1: power=10, bit=0
//        x = 2*2 = 4
//        result = 1 (no multiply)
//        power = 5
//
//Iter 2: power=5, bit=1
//        x = 4*4 = 16
//        result = 1*4 = 4 ← multiply!
//        power = 2
//
//Iter 3: power=2, bit=0
//        x = 16*16 = 256
//        result = 4 (no multiply)
//        power = 1
//
//Iter 4: power=1, bit=1
//        x = 256*256 = 65536
//        result = 4*256 = 1024 ← multiply!
//        power = 0
//
//Return: 1024

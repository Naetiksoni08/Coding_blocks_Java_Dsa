package blind_45_days_sheet;

public class number_complement {

	public static void main(String[] args) {
		int num = 5;
		int temp = num;
		int mask = 0;

		while (temp > 0) {
			mask = (mask << 1) | 1; // mask<<1 Saare bits left shift karo → har bit ka value double → right mein 0
									// aa gaya. fir |1 Rightmost bit (jo abhi 0 hai) ko 1 bana do.
			temp >>= 1; // removes last bit always so jaise phele 101 fir 10 fir 1
		}
		System.out.println(num ^ mask); // 5 ^ 7 = 2 
		// xor rule
		// same number hai toh 0 different number hai toh 1 

	} // 1009 is the same question sam code just one edge case if num==0 return 1

}


//num = 5        →  101
//mask ban gaya  →  111
//XOR (^)        →  010  = 2

// 1 0 = 1
// 0 0 = 0
// 0 1 = 1
// 1 1 = 0

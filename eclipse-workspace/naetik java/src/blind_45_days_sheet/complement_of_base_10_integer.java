package blind_45_days_sheet;

public class complement_of_base_10_integer {

	class Solution {
		public int bitwiseComplement(int num) {
			if (num == 0)
				return 1;
			int temp = num;
			int mask = 0;

			while (temp > 0) {
				mask = (mask << 1) | 1; // mask<<1 Saare bits left shift karo → har bit ka value double → right mein 0
										// aa gaya. fir |1 Rightmost bit (jo abhi 0 hai) ko 1 bana do.
				temp >>= 1; // removes last bit always so jaise phele 101 fir 10 fir 1
			}
			return num ^ mask; // 5 ^ 7 = 2

		} // same code 476 
	}

}

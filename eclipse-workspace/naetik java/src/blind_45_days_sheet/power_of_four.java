package blind_45_days_sheet;

public class power_of_four {

	public static void main(String[] args) {
		int n = 16;
		System.out.println(n > 0 && (n & (n - 1)) == 0 // Power of 2 check karne ka trick yeh check karta hai ki n mein
														// sirf ek hi bit set hai (jo power of 2 ki nishani hai).
				&& (n - 1) % 3 == 0); // if n power of 2 hai upar wala check toh n power of 4 bhi hoga if n-1 %3==0
										// yani n = 16 power of 2 hai yeh so n-1 = 15 % 3 = 0
	}
}

//1   = 0000 0001
//4   = 0000 0100
//16  = 0001 0000
//64  = 0100 0000
//256 = 0001 0000 0000
// if n = 16 then uski binary hogi 00010000 right so 16&15 == 0 then power of 2 hai basicaly 1 set bit hai toh power of 2 hai 
//  0001 0000   (16)
//& 0000 1111   (15)
// -----------
//  0000 0000   (0) so 16 & 15 == 0   → TRUE → power of 2 hai 


// bitwise and 
// a b  ans
// 0 0 = 0
// 0 1 = 0
// 1 0 = 0
// 1 1 = 1



package blind_45_days_sheet;

public class power_of_two {

	public static void main(String[] args) {
		int n = 16;
		if (n <= 0)
			System.out.println(false);
		System.out.println((n & (n - 1)) == 0);
	}

}

//&&  → agar pehla false → doosra check hi nahi karta!
//&   → dono hamesha check karta hai!
//
//||  → agar pehla true → doosra check hi nahi karta!
//|   → dono hamesha check karta hai!

//0 & 0 = 0
//0 & 1 = 0
//1 & 0 = 0
//1 & 1 = 1  ← sirf yahan 1!

// n = 16 == 10000
// n-1 = 15 = 01111 
// 16 & 15 if == 00000 then power of two if not then not power of two

//6 = 110
//6-1 = 5 = 101
//
//  110
//& 101
//-----
//100 ≠ 0  Not power of 2!

// addition rules

//0 + 0 = 0
//0 + 1 = 1
//1 + 0 = 1
//1 + 1 = 10 (sum=0, carry=1)

//0+1 = 1
//0+1 = 1
//0+0 = 0
//0+1 = 1
//1+1 = 10 → sum=0, carry=1
//
//  10000
//+ 11011
//-------
// 101011

//where all can i use this logic
//n & (n-1) == 0 → power of 2!
//count set bits int count = 0;
//while(n != 0) {
//    n = n & (n-1);  // har baar ek bit remove!
//    count++;
//}
// Brian Kernighan's Algorithm!

//check if one bit is set or not
//n & (n-1) == 0 → sirf ek bit hai!
//remove the lowest set bit 
//n & (n-1) → lowest set bit remove ho jaati hai!
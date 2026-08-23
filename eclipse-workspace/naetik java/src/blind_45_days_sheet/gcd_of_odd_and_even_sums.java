package blind_45_days_sheet;

public class gcd_of_odd_and_even_sums {

	public static void main(String[] args) {
		int n = 4;
		int sumodd = 0;
		int sumeven = 0;
		for (int i = 1; i <= n; i++) {
			sumodd += 2 * i - 1;
			sumeven += 2 * i;
		}
		System.out.println(gcd(sumodd, sumeven));

	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}

//
// without loop as well this can be done 
//class Solution {
//    public int gcdOfOddEvenSums(int n) {
//        int sumOdd = n * n;
//        int sumEven = n * (n + 1);
//        return gcd(sumOdd, sumEven);
//    }
//
//    private int gcd(int a, int b) {
//        if (b == 0) return a;
//        return gcd(b, a % b);
//    }
//}
//Sum of first n odd numbers = n²
//n=1: 1                    = 1   = 1²
//n=2: 1+3                  = 4   = 2²
//n=3: 1+3+5                = 9   = 3²
//n=4: 1+3+5+7              = 16  = 4²
//n=5: 1+3+5+7+9            = 25  = 5²
//Sum of first n even numbers = n(n+1)
//n=1: 2                    = 2   = 1×2
//n=2: 2+4                  = 6   = 2×3
//n=3: 2+4+6                = 12  = 3×4
//n=4: 2+4+6+8              = 20  = 4×5
//n=5: 2+4+6+8+10           = 30  = 5×6
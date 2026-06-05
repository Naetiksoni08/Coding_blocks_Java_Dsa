package blind_45_days_sheet;

public class total_waviness_of_number_in_range_1 {
	public static void main(String[] args) {
		int num1 = 120;
		int num2 = 130;
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum += waviness(i);
		}
		System.out.println(sum);
	}

	public static int waviness(int n) {
		int count = 0;
		String s = String.valueOf(n); // jaise 121 aya lets say
		for (int i = 1; i <= s.length() - 2; i++) { // because agar jaise agar no 4848 hai so dekh 0th index check karne
													// ka mtlb nai hai koi prev neigbour nai hoga last check karna ka
													// mtlb nai hai kyukikoi next neighbour nai hoga so check karna hai
													// toh 1st and 2nd index so 4-2 = 2 so 1 check karo aur 2 check karo
													// done
			int prev = s.charAt(i - 1) - '0';
			int curr = s.charAt(i) - '0';
			int next = s.charAt(i + 1) - '0'; // integer mai digit convert ho jayegi

			if (curr > prev && curr > next)
				count++; // peek
			if (curr < prev && curr < next)
				count++; // valley

		}
		return count;
	}

}

//num2 - num1 <= 10^5 10 ke aage 5 zeros!
//Outer loop: num1 to num2 → O(n) where n = range size
//Inner loop: digits → max 6 digits (10^5 = 6 digits) → O(1) constant!
//
//Total = O(n) * O(1) = O(n) ✓

//s = "120", length=3
//
//loop: i=1, i<=1 (length-2=1)
//
//  i=1:
//    prev = s.charAt(0)-'0' = '1'-'0' = 1
//    curr = s.charAt(1)-'0' = '2'-'0' = 2
//    next = s.charAt(2)-'0' = '0'-'0' = 0
//
//    curr>prev && curr>next → 2>1 && 2>0 → PEAK! count=1
//    curr<prev && curr<next → 2<1 && 2<0 → wrong
//
//return 1
//sum = 0+1 = 1

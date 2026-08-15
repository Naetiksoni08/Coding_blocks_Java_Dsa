package blind_45_days_sheet;

public class longest_subsequence_with_non_zero_bitwise_xor {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int totalxor = 0;
		boolean iszero = true;
		for (int num : arr) {
			totalxor ^= num;
			if (num != 0)
				iszero = false;
		}
		if (iszero)
			System.out.println(0);

		if (totalxor != 0)
			System.out.println(arr.length);
		System.out.println(arr.length - 1);
	}

}

//Case 1: Sab zero hain → kuch bhi lo, XOR 0 hi aayega

//Case 2: Poori array ka XOR non-zero hai → puri array le lo

//Case 3: Total XOR = 0 hai, lekin sab zero nahi → koi ek hata do

// xor ki ek property hai ki agar array k XOR == 0 THEN KOI BHI EK ELEMENT HATA DO X JOH FINAL XOR HOGA VOH X HI HOGA 
// EXAMPLE  THIS IS THE THIRD CASE 
//Example 1: nums = [1,2,3]
//Total XOR: 1 ^ 2 ^ 3 = 0 
//Sab zero? Nahi 
//Answer: 3 - 1 = 2  ([2,3] → 2^3=1)


// 1ST CASE AGAR SAB ELEMENT OF THE ARRAY =0 THEN KUB BHI KARLO XOR 0 HI HOGA KYUKI XOR KI TRUTH TABLE IS 
// 0 0 = 0
// 1 0 = 1
// 0 1 = 1
// 1 1 = 0
//SO AGAR ARRAY IS 0,0,0,0 THEN XOR ZERO HI HOGA 


// CASE 2 
// Total XOR != 0 → Puri Array Kyu?
//Toh poori array khud hi ek valid subsequence hai jiska XOR non-zero hai.


//Since hume sabse lamba subsequence chahiye, aur poori array valid hai, toh answer seedha n (array ki length) ho jayega.
//Example: [2, 3, 4]
//2 ^ 3 ^ 4 = 5 ≠ 0
//Poori array le lo → length 3 

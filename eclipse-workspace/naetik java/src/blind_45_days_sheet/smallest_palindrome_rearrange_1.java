package blind_45_days_sheet;

public class smallest_palindrome_rearrange_1 {

	public static void main(String[] args) {
		String s = "babab";
		// count characters
		int[] countchars = new int[26];
		for (char c : s.toCharArray()) {
			countchars[c - 'a']++;
		}
//		a = 2 b = 3
		// now check whether a has odd count or b kyuki that odd count character will
		// become the center or the middle
		// explanation at last
		char oddChar = 0;
		for (int i = 0; i < 26; i++) {
			if (countchars[i] % 2 == 1) {
				oddChar = (char) ('a' + i);
			}
		}

		// find first half
		// explanation at last
		StringBuilder firsthalf = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			int half = countchars[i] / 2; // 2/2 = 1 or 3/2 = 1
			for (int j = 0; j < half; j++) { // 0 sai 0 ya fir 0 sai 1
				firsthalf.append((char) ('a' + i));
			}

		}
		StringBuilder secondhalf = new StringBuilder(firsthalf).reverse(); // ab sai ba

		if (oddChar != 0) {
//			return firsthalf.toString()+oddChar+secondhalf.toString();
		}
//		return firsthalf.toString()+secondhalf.toString(); // jab middle na ho tab  jab sare count even ho 
	}

}


//Result: "ab" + "" + "ba" = "abba" ✅
//index:  0   1   2   3   4   5...
//a   b   c   d   e   f...
//count: [2,  3,  0,  0,  0,  0...]
//↑   ↑
//a=2 b=3

// so dekh odd char = 0;
// i=0 
// count chars[0] = 2
// 2%2==1 no 

//i=1
//countchars[1] = 3
//3%2==1 so 
// odd char = [97+1] = 98 (char) = 'b'

// first half explanation
// i = 0; firsthalf=""
//countchars[0]=2/2=1
//0 sa 1 ek hi baar chalega loop
//firsthalf.append(97+0) = 97(char) = 'a'

// i = 1 firsthalf ='a'
// countchars[1] = 3/2 = 1
// 0 sai 1 only one time
// firsthalf.append(97+1) = 98(char) = 'ab'
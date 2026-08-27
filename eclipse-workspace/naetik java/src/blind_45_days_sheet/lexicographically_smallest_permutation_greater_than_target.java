package blind_45_days_sheet;

public class lexicographically_smallest_permutation_greater_than_target {

	public static void main(String[] args) {
		String s = "abc", target = "bba";
		System.out.println(solve(s, target));

	}

	private static String solve(String s, String target) {
		int n = s.length();
		int[] freq = new int[26];
		for (char c : s.toCharArray()) {
			freq[c - 'a']++;
		}
		// basically iss block mai hum yeh check kar rahe hai ki kya humare string pool
		// mai target ke characters avaiable hai if hai toh use karo agar nai hai toh
		// wahi ruk jao
		int matchlength = 0; // this variables tracks ki kitni positions tak humne successfully match kiya
								// hai with the target character
		while (matchlength < n) {
			int targetchar = target.charAt(matchlength) - 'a'; // b - a = 1 index
			if (freq[targetchar] > 0) { // freq[1] = b (1>0 yes)
				freq[targetchar]--;
				matchlength++;
			} else {
				break;
			}
		}

//		matchLen=0: tc = target[0]-'a' = 'b'-'a' = 1
//			    freq[1] ('b' ka count) = 1, jo > 0 hai!
//			    → freq[1]-- (ab freq: a=1, b=0, c=1)
//			    → matchLen++ (ab matchLen=1)
//
//			matchLen=1: tc = target[1]-'a' = 'b'-'a' = 1
//			    freq[1] ('b' ka count) = 0, jo > 0 NAHI hai!
//			    → break! (loop yahi ruk gaya)

		// matchlength is the info for next step that ki "pehli position (index 0) tak
		// toh string target ke exactly barabar ban sakti hai, lekin position 1 pe hum
		// match nahi kar sakte.

		// Phase 2: backtrack karke bada character dhoondo
// ab dekh next chez joh hum karenge is ki jaise 0th character toh fix hogaya voh string pool mai exist karta tha target ka character but ab 1st index fail ho gaya tha kyuki available pool is this freq: a=1, b=0, c=1
// toh ab hum b sai just bada character dhundenge agar milgaya toh cool 
		int i = matchlength; // 1
		int candidatePos = -1;
		int candidateChar = -1;

		while (true) {
			if (i < n) { // 1 < 3
				int targetChar = target.charAt(i) - 'a'; // b-a = 1
				for (int ch = targetChar + 1; ch < 26; ch++) { // 1+1 = 2 sai 26
					if (freq[ch] > 0) { // if freq[2] which is c whose freq is 1 >0 yes
						candidatePos = i; // so next bada char b ke baad c hai toh posi yaad karo 2 but mila i = 1 par
											// so 2 nai 1 hogi position
						candidateChar = ch; // aur character bhi c
						break;
					}
				}
				if (candidatePos != -1) // agar loop ke baad candidate posi != -1 toh mtlb mil gaya index
					break; // mil gaya, loop se bahar niklo

			}

//			targetChar = target[1] - 'a' = 'b' - 'a' = 1
//
//					Ab loop chalao ch = 2 se 25 tak (matlab 'c' se 'z' tak), dekho kaunsa pehle available milta hai:
//					  ch=2 ('c'): freq[2] = 1 (haan, 'c' available hai!) → mil gaya!
//					  
//					candidatePos = 1
//					candidateChar = 2 (matlab 'c')
//					break (loop se bahar)

//			Ab final answer banate hain
//			Humein pata hai:
//
//			Position 0: target[0]='b' (jo already matched tha, wahi rakhenge)
//			Position 1: 'c' (jo humne abhi dhoondha, target[1] se bada)
//			Baaki positions: jo bhi characters pool mein bache hain, unko sabse chote se bade order mein laga do
			if (i == 0)
				break; // aur peeche nahi ja sakte, fail
			i--;

			// is position ka character wapas pool mein daalo (undo) backtrack part ki agar
			// koi aisa char nai milta joh b sai just bada ho toh b bhi galat jagah laga hai
			// usse bhi change karo toh b ki freq ko +1 kardo aur remove kardo
			int undoChar = target.charAt(i) - 'a';
			freq[undoChar]++;
		}
		if (candidatePos == -1) { // agar posi abhi bhi -1 hai toh mtlb paka koi aisa permuation exist nai karta
									// joh bada ho target sai
			return "";
		}

		// candidatePos = 1 (i =1 par c mila tha)
		// candidateChar = 2
		StringBuilder ans = new StringBuilder(); // final answer banao 0 th par b 1st par c and baki position par chote
													// sai bade order mai laga do remaining char string pool sai nikal
													// ke
		ans.append(target, 0, candidatePos); // //target.substring(0, 1) = "b" (sirf index 0, matlab sirf 'b')
		ans.append((char) ('a' + candidateChar)); //  a = 97+2= 99 so ans = bc so far
		freq[candidateChar]--; // freq[2]-- mtlb c is used so remaing pool is a : 1 b:0 c:0

		for (int ch = 0; ch < 26; ch++) { // 0 sai 25 tk jao aur remaining pool ke element ko add kardo
			for (int k = 0; k < freq[ch]; k++) { //freq[0]  = 1 so 0 sai 1 tk  mtlb ek hi bar chalega fir ch = 1 so freq[1] = 0 (freq of b so 0 sai 0 tk chalega kuch nai hoga same for c 
				ans.append((char) ('a' + ch)); // 97+0 = (char)97 = a
			}
		}
		return ans.toString(); // bca

	}
}

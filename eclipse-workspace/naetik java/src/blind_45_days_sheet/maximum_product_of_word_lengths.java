package blind_45_days_sheet;

public class maximum_product_of_word_lengths {

	public static void main(String[] args) {
		String[] words = { "abcw", "baz", "foo", "bar", "xtfn", "abcdef" };
		int n = words.length;
		int[] masks = new int[n];
		int[] lengths = new int[n];
		for (int i = 0; i < n; i++) {
			String word = words[i];
			lengths[i] = word.length(); // har word ki length rakho store karke uski index par jaise ki abcd ki length =
										// 4 on index 0

			int mask = 0;
			for (int j = 0; j < word.length(); j++) { // lets say word was abcd
				char ch = word.charAt(j); // a nikala
				int posi = ch - 'a'; // a-a = 0
				mask = mask | (1 << posi); // 1<<2^0 = 1*1 = 1 mask = 0000|0001 == 0001
				// 1<<2^1 = 1*2 = 2 so mask = 0001 | 0010 = 0011 // bit wise or is used to merge
				// bits together so like agar dono mai sai kisi ek ke paas bhi 1 hai toh fir 1
				// output mai rahega hi so 0001 | 0010 = 0011
			}
			masks[i] = mask; // it will be used aage so jaise abcd word hai words list mai sai toh uss abcd
								// word ka bitmast bana lets say 1100 aur def ka bana 1111 so aage compare
								// karenge jab toh help karega yhe masks array
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((masks[i] & masks[j]) == 0) { // so 1100 & 1000 = 0000 then no character same we can calculate
					int curr = lengths[i] * lengths[j];// maximum go ahead
					max = Math.max(max, curr);
				}
			}
		}
		System.out.println(max);

	}
//	Jab hum ek word ke saare characters par ghumte hai, toh hum un sabhi bits ko ek sath jodte hai using Bitwise OR (|) so jaise a ka aya 1 fir b ka 0 fir c ka 1 so final bana abc ka 101 
}

package blind_45_days_sheet;

public class Minimum_add_two_make_parentesis_valid {

	public static void main(String[] args) {
		String s = "())";
		int balance = 0;
		int moves = 0;
		for (char c : s.toCharArray()) {
			if (c == '(') {
				balance++;
			} else {
				balance--;
				if (balance < 0) { // balance agar negative hua toh mtlb ki ) yeh zada opened hai mtlb ) iska koi (
									// opening parenthesis nai hai so add karo insert karo so moves++
					moves++;
					balance = 0; // reset kardo kyuki ) closing ke liye humnai opening insert kardia

				}
			}
		}
		// finally bas joh bhi balance hoga voh moves mai add ho jayega // yaha dekh 2
		// cases the phela ki balance jab negative hota hai toh iska mtlb hai ki koi
		// closing brace ka opening brace nai hai toh insert karo aur balance ko zero
		// karo theek hai ab moves+=balance wali line sai phele hum already misisng
		// opening brace problem solve kar chuke hai right ab loop khatam hone ke baad
		// balance mai bas ek hi cheez aur unhandled case bachta hai ki aisa bhi toh ho
		// sakta hai ki opening brace ka koi closing brace na ho mtlb this ka ( this )
		// na ho jaise string ((( mai koi bhi closing brace nai hai toh jaise iss case
		// mai loop ke baad balance=3 hoga toh that means ki closing brace insert karo 3
		// times so so moves+=balance and then return moves bas so closing brace ke liye
		// opening missing ka problem loop ke andar solve kia aur agar opening ke liye
		// closing missing hai toh fir uska loop ke baad solve kia jaise yeh (((

		moves += balance;
		System.out.println(moves);
	} // 2 conditions this
		// inside loop closing ke liye opening missing hai toh simple insert at the
		// beginning and moves++
		// outside loop opening brace ke liye closing missing hai toh balance ko add
		// kardo inside the moves bas

}
